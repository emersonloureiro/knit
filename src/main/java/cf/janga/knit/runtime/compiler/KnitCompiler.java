package cf.janga.knit.runtime.compiler;

import cf.janga.knit.antlr.KnitLanguageBaseListener;
import cf.janga.knit.antlr.KnitLanguageParser;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.Program;
import cf.janga.knit.vm.core.VirtualMachine;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class KnitCompiler extends KnitLanguageBaseListener {

    private final VirtualMachine _vm;
    private Deque<cf.janga.knit.runtime.compiler.Context> _contextStack;
    private CompositeContext _rootContext;

    public KnitCompiler(VirtualMachine vm) {
        _contextStack = new LinkedList<cf.janga.knit.runtime.compiler.Context>();
        _vm = vm;
    }

    public Program compile(KnitLanguageParser.KnitProgramContext tree) {
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, tree);
        List<Instruction> instructions = _rootContext.getInstructions(0);
        return new Program(_vm, instructions.toArray(new Instruction[]{}), 0);
    }

    @Override
    public void enterVariableDeclaration(@NotNull KnitLanguageParser.VariableDeclarationContext ctx) {
        addSubContext(new VariableDeclarationContext(_vm), true);
    }

    @Override
    public void exitVariableDeclaration(@NotNull KnitLanguageParser.VariableDeclarationContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterKnitProgram(@NotNull KnitLanguageParser.KnitProgramContext ctx) {
        addSubContext(new CompositeContext(_vm), true);
        _rootContext = (CompositeContext) _contextStack.peek();
    }

    @Override
    public void exitKnitProgram(@NotNull KnitLanguageParser.KnitProgramContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterIdentifier(@NotNull KnitLanguageParser.IdentifierContext ctx) {
        cf.janga.knit.runtime.compiler.Context top = _contextStack.peek();
        if (top instanceof WithIdentifier && ((WithIdentifier) top).getIdentifier() == null) {
            ((WithIdentifier) top).setIdentifier(getText(ctx.children));
        }
    }

    @Override
    public void enterVariableReference(@NotNull KnitLanguageParser.VariableReferenceContext ctx) {
        if (!(_contextStack.peek() instanceof ForEachDoContext)) {
            addSubContext(new VariableReferenceContext(_vm, getText(ctx.identifier().children)), false);
        }
    }

    @Override
    public void enterExpression(@NotNull KnitLanguageParser.ExpressionContext ctx) {
        addSubContext(new Expression(_vm), true);
    }

    @Override
    public void exitExpression(@NotNull KnitLanguageParser.ExpressionContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterConstant(@NotNull KnitLanguageParser.ConstantContext ctx) {
        if (ctx.STRING() != null) {
            addSubContext(new ConstantContext(_vm, getText(ctx.STRING(), 1)), false);
        }
        if (ctx.number() != null) {
            Float number = Float.parseFloat(getText(ctx.number().children));
            addSubContext(new ConstantContext(_vm, number), false);
        }
    }

    @Override
    public void enterBooleanExpression(@NotNull KnitLanguageParser.BooleanExpressionContext ctx) {
        addSubContext(new BooleanExpressionContext(_vm), true);
    }

    @Override
    public void exitBooleanExpression(@NotNull KnitLanguageParser.BooleanExpressionContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterPrint(@NotNull KnitLanguageParser.PrintContext ctx) {
        addSubContext(new PrintContext(_vm), true);
    }

    @Override
    public void exitPrint(@NotNull KnitLanguageParser.PrintContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterMainFunction(@NotNull KnitLanguageParser.MainFunctionContext ctx) {
        addSubContext(new FunctionContext(_vm, true), true);
    }

    @Override
    public void exitMainFunction(@NotNull KnitLanguageParser.MainFunctionContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterForeachDoComprehension(@NotNull KnitLanguageParser.ForeachDoComprehensionContext ctx) {
        if (ctx.listOutputCommand() != null) {
            handleCommandExpressionContext(ctx.listOutputCommand().LIST_OUTPUT_COMMAND(), true, true);
        } else if (ctx.variableReference() != null) {
            addSubContext(new VariableReferenceContext(_vm, getText(ctx.variableReference().children)), false);
        }
        addSubContext(new ForEachDoContext(_vm), true);
    }

    @Override
    public void exitForeachDoComprehension(@NotNull KnitLanguageParser.ForeachDoComprehensionContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterProgrammingConstruct(@NotNull KnitLanguageParser.ProgrammingConstructContext ctx) {
        addSubContext(new CompositeContext(_vm), true);
    }

    @Override
    public void exitProgrammingConstruct(@NotNull KnitLanguageParser.ProgrammingConstructContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterCode(@NotNull KnitLanguageParser.CodeContext ctx) {
        addSubContext(new CompositeContext(_vm), true);
    }

    @Override
    public void exitCode(@NotNull KnitLanguageParser.CodeContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterFunctionBody(@NotNull KnitLanguageParser.FunctionBodyContext ctx) {
        addSubContext(new CompositeContext(_vm), true);
    }

    @Override
    public void exitFunctionBody(@NotNull KnitLanguageParser.FunctionBodyContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterComplexMathExpression(@NotNull KnitLanguageParser.ComplexMathExpressionContext ctx) {
        MathExpressionTree tree = new MathExpressionTree(_vm);
        if (_contextStack.peek() instanceof MathExpressionTree) {
            ((MathExpressionTree) _contextStack.peek()).add(tree);
        }
        addSubContext(tree, true);
    }

    @Override
    public void exitComplexMathExpression(@NotNull KnitLanguageParser.ComplexMathExpressionContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterEnclosedMathExpression(@NotNull KnitLanguageParser.EnclosedMathExpressionContext ctx) {
        MathExpressionTree tree = new MathExpressionTree(_vm);
        if (_contextStack.peek() instanceof MathExpressionTree) {
            ((MathExpressionTree) _contextStack.peek()).add(tree);
        }
        _contextStack.push(tree);
    }

    @Override
    public void exitEnclosedMathExpression(@NotNull KnitLanguageParser.EnclosedMathExpressionContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterNumber(@NotNull KnitLanguageParser.NumberContext ctx) {
        if (_contextStack.peek() instanceof MathExpressionTree) {
            Float number = Float.parseFloat(getText(ctx.children));
            NumberNode numberNode = new NumberNode(_vm, number);
            ((MathExpressionTree) _contextStack.peek()).add(numberNode);
        }
    }

    @Override
    public void enterMathOperator(@NotNull KnitLanguageParser.MathOperatorContext ctx) {
        if (_contextStack.peek() instanceof MathExpressionTree) {
            OperatorNode.Operator operator = OperatorNode.fromString(getText(ctx.children));
            OperatorNode operatorNode = new OperatorNode(_vm, operator);
            ((MathExpressionTree) _contextStack.peek()).add(operatorNode);
        }
    }

    @Override
    public void enterListOutputCommand(KnitLanguageParser.ListOutputCommandContext ctx) {
        if (_contextStack.peek() instanceof ForEachDoContext) {
            // No-op, handled on enter for ForEachDoContext
        } else if (_contextStack.peek() instanceof Expression) {
            handleCommandExpressionContext(ctx.LIST_OUTPUT_COMMAND(), true, true);
        } else {
            handleCommandExpressionContext(ctx.LIST_OUTPUT_COMMAND(), true, false);
        }
    }

    @Override
    public void enterSingleOutputCommand(KnitLanguageParser.SingleOutputCommandContext ctx) {
        if (_contextStack.peek() instanceof Expression) {
            handleCommandExpressionContext(ctx.SINGLE_OUTPUT_COMMAND(), false, true);
        } else {
            handleCommandExpressionContext(ctx.SINGLE_OUTPUT_COMMAND(), false, false);
        }
    }

    @Override
    public void enterAssertion(@NotNull KnitLanguageParser.AssertionContext ctx) {
        addSubContext(new AssertContext(_vm, ctx.start.getLine()), true);
    }

    @Override
    public void exitAssertion(@NotNull KnitLanguageParser.AssertionContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterFunctionCallExpression(KnitLanguageParser.FunctionCallExpressionContext ctx) {
    }

    @Override
    public void exitFunctionCallExpression(KnitLanguageParser.FunctionCallExpressionContext ctx) {
        List<String> modules = new LinkedList<>();
        ctx.modulePrefix().forEach( module -> {
            modules.add(getText(module.children));
        });
        String function = getText(ctx.identifier().children);
        if (_contextStack.peek() instanceof Expression) {
            addSubContext(new FunctionCallExpression(_vm, modules, function, ctx.expression().size(),true),true);
        } else {
            addSubContext(new FunctionCallExpression(_vm, modules, function, ctx.expression().size(), false),true);
        }
    }

    private void addSubContext(Context context, boolean pushToStack) {
        if (_contextStack.peek() instanceof CompositeContext || _contextStack.isEmpty()) {
            if (!_contextStack.isEmpty()) {
                ((CompositeContext) _contextStack.peek()).add(context);
            }
            if (pushToStack) {
                _contextStack.push(context);
            }
        }
    }

    private void handleCommandExpressionContext(TerminalNode commandNode, boolean asList, boolean returnValue) {
        String command = commandNode.getText();
        command = getText(commandNode, 1);
        addSubContext(new CommandExpressionContext(_vm, command, asList, returnValue), false);
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
