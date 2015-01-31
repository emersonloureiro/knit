package cf.janga.knit.runtime.compiler;

import cf.janga.knit.antlr.KnitLanguageListener;
import cf.janga.knit.antlr.KnitLanguageParser;
import cf.janga.knit.vm.core.Instruction;
import cf.janga.knit.vm.core.Program;
import cf.janga.knit.vm.core.VirtualMachine;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class KnitCompiler implements KnitLanguageListener {

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
        addSubContext(new VariableDeclarationContext(_vm));
    }

    @Override
    public void exitVariableDeclaration(@NotNull KnitLanguageParser.VariableDeclarationContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterKnitProgram(@NotNull KnitLanguageParser.KnitProgramContext ctx) {
        addSubContext(new CompositeContext(_vm));
        _rootContext = (CompositeContext) _contextStack.peek();
    }

    @Override
    public void exitKnitProgram(@NotNull KnitLanguageParser.KnitProgramContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterIdentifier(@NotNull KnitLanguageParser.IdentifierContext ctx) {
        cf.janga.knit.runtime.compiler.Context top = _contextStack.peek();
        if (top instanceof WithIdentifier) {
            ((WithIdentifier) top).setIdentifier(getText(ctx.children));
        } else if (top instanceof BooleanExpressionContext) {
            BooleanExpressionContext booleanExpressionContext = (BooleanExpressionContext) _contextStack.peek();
            booleanExpressionContext.addParameter(KnitType.REFERENCE, getText(ctx.children));
        }
    }

    @Override
    public void enterVariableValue(@NotNull KnitLanguageParser.VariableValueContext ctx) {
        VariableValueContext variableValueContext = new VariableValueContext(_vm);
        if (ctx.COMMAND() != null) {
            variableValueContext.setValue(new CommandValue(getText(ctx.COMMAND(), 1)));
        }
        addSubContext(variableValueContext);
    }

    @Override
    public void exitVariableValue(@NotNull KnitLanguageParser.VariableValueContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterConstant(@NotNull KnitLanguageParser.ConstantContext ctx) {
        if (_contextStack.peek() instanceof VariableValueContext) {
            VariableValueContext variableValueContext = (VariableValueContext) _contextStack.peek();
            if (ctx.STRING() != null) {
                variableValueContext.setValue(new StringValue(getText(ctx.STRING(), 1)));
            }
            if (ctx.number() != null) {
                Float number = Float.parseFloat(getText(ctx.number().children));
                variableValueContext.setValue(new NumberValue(number));
            }
        } else if (_contextStack.peek() instanceof PrintContext) {
            PrintContext printContext = (PrintContext) _contextStack.peek();
            if (ctx.STRING() != null) {
                printContext.setArgumentType(KnitType.STRING);
                printContext.setArgument(getText(ctx.STRING(), 1));
            }
            if (ctx.number() != null) {
                printContext.setArgumentType(KnitType.NUMBER);
                printContext.setArgument(String.valueOf(Float.parseFloat(getText(ctx.number().children))));
            }
        } else if (_contextStack.peek() instanceof BooleanExpressionContext) {
            BooleanExpressionContext booleanExpressionContext = (BooleanExpressionContext) _contextStack.peek();
            if (ctx.STRING() != null) {
                booleanExpressionContext.addParameter(KnitType.STRING, getText(ctx.STRING(), 1));
            }
            if (ctx.number() != null) {
                Float number = Float.parseFloat(getText(ctx.number().children));
                booleanExpressionContext.addParameter(KnitType.NUMBER, number);
            }
        }
    }

    @Override
    public void exitConstant(@NotNull KnitLanguageParser.ConstantContext ctx) {
    }

    @Override
    public void enterBooleanExpression(@NotNull KnitLanguageParser.BooleanExpressionContext ctx) {
        addSubContext(new BooleanExpressionContext(_vm));
    }

    @Override
    public void exitBooleanExpression(@NotNull KnitLanguageParser.BooleanExpressionContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterPrint(@NotNull KnitLanguageParser.PrintContext ctx) {
        addSubContext(new PrintContext(_vm));
    }

    @Override
    public void exitPrint(@NotNull KnitLanguageParser.PrintContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterMainFunction(@NotNull KnitLanguageParser.MainFunctionContext ctx) {
        addSubContext(new FunctionContext(_vm, true));
    }

    @Override
    public void exitMainFunction(@NotNull KnitLanguageParser.MainFunctionContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterMethodCall(@NotNull KnitLanguageParser.MethodCallContext ctx) {
        addSubContext(new MethodCallContext(_vm));
    }

    @Override
    public void exitMethodCall(@NotNull KnitLanguageParser.MethodCallContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterArgument(@NotNull KnitLanguageParser.ArgumentContext ctx) {
        if (_contextStack.peek() instanceof PrintContext) {
            PrintContext printContext = (PrintContext) _contextStack.peek();
            if (ctx.identifier() != null) {
                printContext.setArgumentType(KnitType.REFERENCE);
                printContext.setArgument(getText(ctx.identifier().children));
            }
        }
    }

    @Override
    public void enterForeach(@NotNull KnitLanguageParser.ForeachContext ctx) {
        addSubContext(new ForEachContext(_vm));
    }

    @Override
    public void exitForeach(@NotNull KnitLanguageParser.ForeachContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterProgrammingConstruct(@NotNull KnitLanguageParser.ProgrammingConstructContext ctx) {
        addSubContext(new CompositeContext(_vm));
    }

    @Override
    public void exitProgrammingConstruct(@NotNull KnitLanguageParser.ProgrammingConstructContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterCode(@NotNull KnitLanguageParser.CodeContext ctx) {
        addSubContext(new CompositeContext(_vm));
    }

    @Override
    public void exitCode(@NotNull KnitLanguageParser.CodeContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterFunctionBody(@NotNull KnitLanguageParser.FunctionBodyContext ctx) {
        addSubContext(new CompositeContext(_vm));
    }

    @Override
    public void exitFunctionBody(@NotNull KnitLanguageParser.FunctionBodyContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterComplexMathExpression(@NotNull KnitLanguageParser.ComplexMathExpressionContext ctx) {
        ExpressionTree tree = new ExpressionTree(_vm);
        if (_contextStack.peek() instanceof ExpressionTree) {
            ((ExpressionTree) _contextStack.peek()).add(tree);
        }
        addSubContext(tree);
    }

    @Override
    public void exitComplexMathExpression(@NotNull KnitLanguageParser.ComplexMathExpressionContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterEnclosedMathExpression(@NotNull KnitLanguageParser.EnclosedMathExpressionContext ctx) {
        ExpressionTree tree = new ExpressionTree(_vm);
        if (_contextStack.peek() instanceof ExpressionTree) {
            ((ExpressionTree) _contextStack.peek()).add(tree);
        }
        _contextStack.push(tree);
    }

    @Override
    public void exitEnclosedMathExpression(@NotNull KnitLanguageParser.EnclosedMathExpressionContext ctx) {
        _contextStack.pop();
    }

    @Override
    public void enterSimpleMathExpression(@NotNull KnitLanguageParser.SimpleMathExpressionContext ctx) {
    }

    @Override
    public void exitSimpleMathExpression(@NotNull KnitLanguageParser.SimpleMathExpressionContext ctx) {
    }

    @Override
    public void enterNumber(@NotNull KnitLanguageParser.NumberContext ctx) {
        if (_contextStack.peek() instanceof ExpressionTree) {
            Float number = Float.parseFloat(getText(ctx.children));
            NumberNode numberNode = new NumberNode(_vm, number);
            ((ExpressionTree) _contextStack.peek()).add(numberNode);
        }
    }

    @Override
    public void enterMathOperator(@NotNull KnitLanguageParser.MathOperatorContext ctx) {
        if (_contextStack.peek() instanceof ExpressionTree) {
            OperatorNode.Operator operator = OperatorNode.fromString(getText(ctx.children));
            OperatorNode operatorNode = new OperatorNode(_vm, operator);
            ((ExpressionTree) _contextStack.peek()).add(operatorNode);
        }
    }

    @Override
    public void exitIdentifier(@NotNull KnitLanguageParser.IdentifierContext ctx) {
    }

    @Override
    public void exitMathOperator(@NotNull KnitLanguageParser.MathOperatorContext ctx) {
    }

    @Override
    public void enterFunction(@NotNull KnitLanguageParser.FunctionContext ctx) {
    }

    @Override
    public void exitFunction(@NotNull KnitLanguageParser.FunctionContext ctx) {
    }

    @Override
    public void enterParameter(@NotNull KnitLanguageParser.ParameterContext ctx) {
    }

    @Override
    public void exitParameter(@NotNull KnitLanguageParser.ParameterContext ctx) {
    }

    @Override
    public void enterListMethods(@NotNull KnitLanguageParser.ListMethodsContext ctx) {
    }

    @Override
    public void exitListMethods(@NotNull KnitLanguageParser.ListMethodsContext ctx) {
    }

    @Override
    public void exitArgument(@NotNull KnitLanguageParser.ArgumentContext ctx) {
    }

    @Override
    public void enterFunctionName(@NotNull KnitLanguageParser.FunctionNameContext ctx) {
    }

    @Override
    public void exitFunctionName(@NotNull KnitLanguageParser.FunctionNameContext ctx) {
    }

    @Override
    public void enterSystemFunctions(@NotNull KnitLanguageParser.SystemFunctionsContext ctx) {
    }

    @Override
    public void exitSystemFunctions(@NotNull KnitLanguageParser.SystemFunctionsContext ctx) {
    }

    @Override
    public void enterSystemMethod(@NotNull KnitLanguageParser.SystemMethodContext ctx) {
    }

    @Override
    public void exitSystemMethod(@NotNull KnitLanguageParser.SystemMethodContext ctx) {
    }

    @Override
    public void exitNumber(@NotNull KnitLanguageParser.NumberContext ctx) {
    }

    @Override
    public void visitTerminal(@NotNull TerminalNode terminalNode) {
    }

    @Override
    public void visitErrorNode(@NotNull ErrorNode errorNode) {
    }

    @Override
    public void enterEveryRule(@NotNull ParserRuleContext parserRuleContext) {
    }

    @Override
    public void exitEveryRule(@NotNull ParserRuleContext parserRuleContext) {
    }

    private void addSubContext(Context context) {
        if (_contextStack.peek() instanceof CompositeContext || _contextStack.isEmpty()) {
            if (!_contextStack.isEmpty()) {
                ((CompositeContext) _contextStack.peek()).add(context);
            }
            _contextStack.push(context);
        }
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
