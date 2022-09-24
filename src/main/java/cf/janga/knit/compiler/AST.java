package cf.janga.knit.compiler;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import cf.janga.knit.vm.core.Instruction;

/**
 * Abstract Syntax Tree (AST) representation of a Knit program.
 */
public class AST {

    /**
     * Keeps the list of visited nodes/constructs of the language
     * as it's being parsed - i.e., variable definitions, expressions, etc -
     * to track the one we're currently visiting - so we know where to
     * add constructs as they're visited - and so we can backtrack
     * as we visit the construct in a tree-like fashion.
     */
    private final Deque<ASTNode> nodes;

    /**
     * The root node of the AST representation of a Knit program.
     * It's from where we start generating program instructions.
     */
    private ASTNode root;

    /**
     * Creates a new AST.
     */
    public AST() {
        this.nodes = new LinkedList<>();
    }

    /**
     * Traverses the AST, fetching instructions for each of the
     * parsed constructs of a Knit program.
     * @param start
     * @return
     */
    public List<Instruction> getInstructions(int start) {
        return this.root.getInstructions(start);
    }
    
    /**
     * Adds a parsed construct from a Knit program as a node
     * to this AST.
     * @param child
     */
    public void addNode(ASTNode child) {
        if (this.root == null) {
            this.root = child;
        }

        ASTNode current = this.nodes.peek();
        this.nodes.push(child);
        if (current == null) {
            return;
        }

        current.doAddChild(child);
        current.addChild(child);
        child.setParent(current);
    }

    /**
     * Prints the AST - just for debugging purposes.
     */
    public void print() {
        int spaces = 0;
        this.root.print(spaces++);
    }

    /**
     * Notifies the AST that current construct has finished being visited
     * so it can go back to its previous construct.
     */
    public void finishedNode() {
        if (this.nodes.peek() == null) {
            return;
        }
        this.nodes.pop();
    }
}
