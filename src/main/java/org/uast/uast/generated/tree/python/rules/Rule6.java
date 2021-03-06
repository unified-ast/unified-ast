/*
 * MIT License Copyright (c) 2022 unified-ast
 * https://github.com/unified-ast/unified-ast/blob/master/LICENSE.txt
 */

package org.uast.uast.generated.tree.python.rules;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.uast.uast.base.Builder;
import org.uast.uast.base.Converter;
import org.uast.uast.base.EmptyTree;
import org.uast.uast.base.Factory;
import org.uast.uast.base.Node;

/**
 * Converter describing DSL conversion rule.
 *
 * @since 1.0
 */
public final class Rule6 implements Converter {
    /**
     * The instance.
     */
    public static final Converter INSTANCE = new Rule6();

    /**
     * The 'Identifier' string.
     */
    private static final String IDENTIFIER = "Identifier";

    /**
     * The 'ExpressionList' string.
     */
    private static final String EXPRESSION_LIST = "ExpressionList";

    /**
     * The 'FunctionCall' string.
     */
    private static final String FUNCTION_CALL = "FunctionCall";

    /**
     * Constructor.
     */
    private Rule6() {
    }

    @Override
    public Node convert(final Node node, final Factory factory) {
        Node result = EmptyTree.INSTANCE;
        final Map<Integer, List<Node>> children = new TreeMap<>();
        final Map<Integer, String> data = new TreeMap<>();
        final boolean matched = Matcher27.INSTANCE.match(node, children, data);
        if (matched) {
            result = Rule6.firstBuilder(factory, data);
        }
        return result;
    }

    /**
     * Builds a node with 'FunctionCall' type.
     * @param factory The node factory
     * @param data The data
     * @return A node
     */
    private static Node firstBuilder(final Factory factory, final Map<Integer, String> data) {
        Node result = EmptyTree.INSTANCE;
        final Builder builder = factory.createBuilder(Rule6.FUNCTION_CALL);
        final List<Node> list = new LinkedList<>();
        list.add(Rule6.secondBuilder(factory, data));
        list.add(Rule6.thirdBuilder(factory));
        final boolean applied = builder.setChildrenList(list);
        if (applied && builder.isValid()) {
            result = builder.createNode();
        }
        return result;
    }

    /**
     * Builds a node with 'Identifier' type.
     * @param factory The node factory
     * @param data The data
     * @return A node
     */
    private static Node secondBuilder(final Factory factory, final Map<Integer, String> data) {
        Node result = EmptyTree.INSTANCE;
        final Builder builder = factory.createBuilder(Rule6.IDENTIFIER);
        final boolean set = builder.setData(data.get(1));
        if (set && builder.isValid()) {
            result = builder.createNode();
        }
        return result;
    }

    /**
     * Builds a node with 'ExpressionList' type.
     * @param factory The node factory
     * @return A node
     */
    private static Node thirdBuilder(final Factory factory) {
        Node result = EmptyTree.INSTANCE;
        final Builder builder = factory.createBuilder(Rule6.EXPRESSION_LIST);
        if (builder.isValid()) {
            result = builder.createNode();
        }
        return result;
    }
}
