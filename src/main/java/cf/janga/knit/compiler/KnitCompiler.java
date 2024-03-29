package cf.janga.knit.compiler;

import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import cf.janga.knit.antlr.KnitLanguageBaseListener;
import cf.janga.knit.antlr.KnitLanguageParser.BoolContext;
import cf.janga.knit.antlr.KnitLanguageParser.BooleanOperatorContext;
import cf.janga.knit.antlr.KnitLanguageParser.BooleanPrefixContext;
import cf.janga.knit.antlr.KnitLanguageParser.BooleanSuffixContext;
import cf.janga.knit.antlr.KnitLanguageParser.CodeContext;
import cf.janga.knit.antlr.KnitLanguageParser.ConstantContext;
import cf.janga.knit.antlr.KnitLanguageParser.EnclosedBooleanExpressionContext;
import cf.janga.knit.antlr.KnitLanguageParser.EnclosedNumericalExpressionContext;
import cf.janga.knit.antlr.KnitLanguageParser.ExitContext;
import cf.janga.knit.antlr.KnitLanguageParser.ExpressionContext;
import cf.janga.knit.antlr.KnitLanguageParser.ForeachDoComprehensionContext;
import cf.janga.knit.antlr.KnitLanguageParser.FunctionCallExpressionContext;
import cf.janga.knit.antlr.KnitLanguageParser.FunctionContext;
import cf.janga.knit.antlr.KnitLanguageParser.IdentifierContext;
import cf.janga.knit.antlr.KnitLanguageParser.IfConditionContext;
import cf.janga.knit.antlr.KnitLanguageParser.KnitProgramContext;
import cf.janga.knit.antlr.KnitLanguageParser.ListOutputCommandContext;
import cf.janga.knit.antlr.KnitLanguageParser.MainFunctionContext;
import cf.janga.knit.antlr.KnitLanguageParser.MathExpressionContext;
import cf.janga.knit.antlr.KnitLanguageParser.NumberContext;
import cf.janga.knit.antlr.KnitLanguageParser.NumericalOperatorContext;
import cf.janga.knit.antlr.KnitLanguageParser.ProgrammingConstructContext;
import cf.janga.knit.antlr.KnitLanguageParser.SingleOutputCommandContext;
import cf.janga.knit.antlr.KnitLanguageParser.StandardCommandContext;
import cf.janga.knit.antlr.KnitLanguageParser.VariableDeclarationContext;
import cf.janga.knit.antlr.KnitLanguageParser.VariableReferenceContext;
import cf.janga.knit.compiler.constructs.BooleanConstant;
import cf.janga.knit.compiler.constructs.Code;
import cf.janga.knit.compiler.constructs.Command;
import cf.janga.knit.compiler.constructs.ExitConstruct;
import cf.janga.knit.compiler.constructs.Expression;
import cf.janga.knit.compiler.constructs.ForEachDoComprehension;
import cf.janga.knit.compiler.constructs.Function;
import cf.janga.knit.compiler.constructs.FunctionCall;
import cf.janga.knit.compiler.constructs.Identifier;
import cf.janga.knit.compiler.constructs.IfCondition;
import cf.janga.knit.compiler.constructs.KnitProgram;
import cf.janga.knit.compiler.constructs.MathExpression;
import cf.janga.knit.compiler.constructs.MathOperator;
import cf.janga.knit.compiler.constructs.NumberConstant;
import cf.janga.knit.compiler.constructs.StringConstant;
import cf.janga.knit.compiler.constructs.VariableDeclaration;
import cf.janga.knit.compiler.constructs.VariableReference;
import cf.janga.knit.compiler.constructs.WrapperNode;
import cf.janga.knit.compiler.constructs.Command.Type;
import cf.janga.knit.vm.core.Program;
import cf.janga.knit.vm.core.VirtualMachine;

/**
 * The language compiler. It uses Antlr's listeners to walk through a
 * parsed Knit program from source code, and be notified as each construct
 * is parsed. It uses this to build an AST with our own internal representation
 * of the Knit program, which is then used to generate the program instructions
 * after going through all constructs of the program.
 */
public class KnitCompiler extends KnitLanguageBaseListener {

    private final VirtualMachine vm;
    private AST ast;
    private String currentModule;

    /**
     * Creates a new compiler with the VM provided.
     */
    public KnitCompiler(VirtualMachine vm) {
        this.vm = vm;
        this.ast = new AST();
        this.currentModule = "main";
    }

    /**
     * Compiles program provide - in Antlr's representation - into our
     * own representation with the instructions generated and ready
     * for execution.
     */
    public Program compile(KnitProgramContext program) {
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, program);
        this.ast.loadInstructions();

        return new Program(this.vm, 1);
    }

    @Override
    public void enterKnitProgram(KnitProgramContext ctx) {
        this.ast.addNode(new KnitProgram(this.vm));
    }

    @Override
    public void exitKnitProgram(KnitProgramContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterMainFunction(MainFunctionContext ctx) {
        this.ast.addNode(new Function(this.vm, this.currentModule, "main", true));
    }

    @Override
    public void exitMainFunction(MainFunctionContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterFunction(FunctionContext ctx) {
        String functionName = getText(ctx.identifier().children);
        this.ast.addNode(new Function(this.vm, this.currentModule, functionName, false));
    }

    @Override
    public void exitFunction(FunctionContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterCode(CodeContext ctx) {
        this.ast.addNode(new Code(this.vm));
    }

    @Override
    public void exitCode(CodeContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterProgrammingConstruct(ProgrammingConstructContext ctx) {
        this.ast.addNode(new WrapperNode(this.vm, "ProgrammingConstruct"));
    }

    @Override
    public void exitProgrammingConstruct(ProgrammingConstructContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterVariableDeclaration(VariableDeclarationContext ctx) {
        this.ast.addNode(new VariableDeclaration(this.vm));
    }

    @Override
    public void exitVariableDeclaration(VariableDeclarationContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterIdentifier(IdentifierContext ctx) {
        this.ast.addNode(new Identifier(this.vm, getText(ctx.children)));
    }

    @Override
    public void exitIdentifier(IdentifierContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterExpression(ExpressionContext ctx) {
        this.ast.addNode(new Expression(this.vm));
    }

    @Override
    public void exitExpression(ExpressionContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterConstant(ConstantContext ctx) {
        if (ctx.STRING() != null) {
            String string = getText(ctx.STRING(), 1);
            this.ast.addNode(new StringConstant(this.vm, string));
        }
    }

    @Override
    public void exitConstant(ConstantContext ctx) {
        if (ctx.STRING() != null) {
            this.ast.finishedNode();
        }
    }

    @Override
    public void enterNumber(NumberContext ctx) {
        String numberString = getText(ctx.children);
        this.ast.addNode(new NumberConstant(this.vm, Float.parseFloat(numberString)));
    }

    @Override
    public void exitNumber(NumberContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterBool(BoolContext ctx) {
        String boolString = getText(ctx.children);
        this.ast.addNode(new BooleanConstant(this.vm, Boolean.parseBoolean(boolString)));
    }

    @Override
    public void exitBool(BoolContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterListOutputCommand(ListOutputCommandContext ctx) {
        this.ast.addNode(new Command(this.vm, ctx.LIST_OUTPUT_COMMAND().getText(), Type.LIST_OUTPUT));
    }

    @Override
    public void exitListOutputCommand(ListOutputCommandContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterSingleOutputCommand(SingleOutputCommandContext ctx) {
        this.ast.addNode(new Command(this.vm, ctx.SINGLE_OUTPUT_COMMAND().getText(), Type.SINGLE_OUTPUT));
    }

    @Override
    public void exitSingleOutputCommand(SingleOutputCommandContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterStandardCommand(StandardCommandContext ctx) {
        this.ast.addNode(new Command(this.vm, ctx.STANDARD_COMMAND().getText(), Type.STANDARD));
    }

    @Override
    public void exitStandardCommand(StandardCommandContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterVariableReference(VariableReferenceContext ctx) {
        if (ctx.identifier() != null) {
            this.ast.addNode(new VariableReference(this.vm, getText(ctx.identifier().children)));
        } else if (ctx.PROCESS_EXIT_CODE_VARIABLE() != null) {
            this.ast.addNode(new VariableReference(this.vm, getText(ctx.PROCESS_EXIT_CODE_VARIABLE(), 0)));
        } else {
            this.ast.addNode(new VariableReference(this.vm, getText(ctx.CLI_ARGUMENT_REFERENCE(), 0)));
        }
    }

    @Override
    public void exitVariableReference(VariableReferenceContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterFunctionCallExpression(FunctionCallExpressionContext ctx) {
        List<String> modules = new LinkedList<>();
        ctx.modulePrefix().forEach(module -> {
            modules.add(getText(module.children));
        });
        String function = getText(ctx.identifier().children);
        this.ast.addNode(new FunctionCall(this.vm, modules, function, ctx.expression().size()));
    }

    @Override
    public void exitFunctionCallExpression(FunctionCallExpressionContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterForeachDoComprehension(ForeachDoComprehensionContext ctx) {
        this.ast.addNode(new ForEachDoComprehension(this.vm));
    }

    @Override
    public void exitForeachDoComprehension(ForeachDoComprehensionContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterMathExpression(MathExpressionContext ctx) {
        this.ast.addNode(new MathExpression(this.vm, ctx.booleanExpression() != null));
    }

    @Override
    public void exitMathExpression(MathExpressionContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterBooleanOperator(BooleanOperatorContext ctx) {
        this.ast.addNode(new MathOperator(this.vm, ctx.getText()));
    }

    @Override
    public void exitBooleanOperator(BooleanOperatorContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterEnclosedBooleanExpression(EnclosedBooleanExpressionContext ctx) {
        this.ast.addNode(new MathExpression(this.vm, true));
    }

    @Override
    public void exitEnclosedBooleanExpression(EnclosedBooleanExpressionContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterNumericalOperator(NumericalOperatorContext ctx) {
        this.ast.addNode(new MathOperator(this.vm, ctx.getText()));
    }

    @Override
    public void exitNumericalOperator(NumericalOperatorContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterEnclosedNumericalExpression(EnclosedNumericalExpressionContext ctx) {
        this.ast.addNode(new MathExpression(this.vm, false));
    }

    @Override
    public void exitEnclosedNumericalExpression(EnclosedNumericalExpressionContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterBooleanPrefix(BooleanPrefixContext ctx) {
        this.ast.addNode(new MathOperator(this.vm, ctx.getText()));
    }

    @Override
    public void exitBooleanPrefix(BooleanPrefixContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterBooleanSuffix(BooleanSuffixContext ctx) {
        this.ast.addNode(new MathOperator(this.vm, ctx.getText()));
    }

    @Override
    public void exitBooleanSuffix(BooleanSuffixContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterExit(ExitContext ctx) {
        int exitCode = Integer.valueOf(getTerminalNodesText(ctx.DIGIT()));
        this.ast.addNode(new ExitConstruct(this.vm, exitCode));
    }

    @Override
    public void exitExit(ExitContext ctx) {
        this.ast.finishedNode();
    }

    @Override
    public void enterIfCondition(IfConditionContext ctx) {
        this.ast.addNode(new IfCondition(this.vm));
    }

    @Override
    public void exitIfCondition(IfConditionContext ctx) {
        this.ast.finishedNode();
    }

    private String getTerminalNodesText(List<TerminalNode> nodes) {
        String value = "";
        for (TerminalNode node : nodes) {
            value += node.getText();
        }
        return value;
    }

    private String getText(TerminalNode node, int reference) {
        String text = node.getText();
        return text.substring(reference, text.length() - reference);
    }

    private String getText(List<ParseTree> nodes) {
        String text = "";
        for (ParseTree node : nodes) {
            text += node.getText();
        }
        return text;
    }
}
