/*
 * MIT License Copyright (c) 2022 unified-ast
 * https://github.com/unified-ast/unified-ast/blob/master/LICENSE.txt
 */

package org.uast.uast.generated.tree.java.rules;

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
public final class Rule17 implements Converter {
    /**
     * The instance.
     */
    public static final Converter INSTANCE = new Rule17();

    /**
     * The 'Modifier' string.
     */
    private static final String MODIFIER = "Modifier";

    /**
     * The 'ModifierBlock' string.
     */
    private static final String MODIFIER_BLOCK = "ModifierBlock";

    /**
     * The number of the first hole.
     */
    private static final int FIRST_HOLE_ID = 5;

    /**
     * The number of the second hole.
     */
    private static final int SECOND_HOLE_ID = 3;

    /**
     * The 'ParameterBlock' string.
     */
    private static final String PARAMETER_BLOCK = "ParameterBlock";

    /**
     * The number of the third hole.
     */
    private static final int THIRD_HOLE_ID = 6;

    /**
     * The 'FunctionDeclaration' string.
     */
    private static final String FUNCTION_DECLARA = "FunctionDeclaration";

    /**
     * Constructor.
     */
    private Rule17() {
    }

    @Override
    public Node convert(final Node node, final Factory factory) {
        Node result = EmptyTree.INSTANCE;
        final Map<Integer, List<Node>> children = new TreeMap<>();
        final Map<Integer, String> data = new TreeMap<>();
        final boolean matched = Matcher21.INSTANCE.match(node, children, data);
        if (matched) {
            result = Rule17.firstBuilder(factory, children, data);
        }
        return result;
    }

    /**
     * Builds a node with 'FunctionDeclaration' type.
     * @param factory The node factory
     * @param children The collection of child nodes
     * @param data The data
     * @return A node
     */
    private static Node firstBuilder(final Factory factory,
        final Map<Integer, List<Node>> children,
        final Map<Integer, String> data) {
        Node result = EmptyTree.INSTANCE;
        final Builder builder = factory.createBuilder(Rule17.FUNCTION_DECLARA);
        final List<Node> list = new LinkedList<>();
        list.add(Rule17.secondBuilder(factory, data));
        list.addAll(children.get(Rule17.FIRST_HOLE_ID));
        list.addAll(children.get(Rule17.SECOND_HOLE_ID));
        list.add(Rule17.fifthBuilder(factory, children));
        list.addAll(children.get(Rule17.THIRD_HOLE_ID));
        final boolean applied = builder.setChildrenList(list);
        if (applied && builder.isValid()) {
            result = builder.createNode();
        }
        return result;
    }

    /**
     * Builds a node with 'ModifierBlock' type.
     * @param factory The node factory
     * @param data The data
     * @return A node
     */
    private static Node secondBuilder(final Factory factory, final Map<Integer, String> data) {
        Node result = EmptyTree.INSTANCE;
        final Builder builder = factory.createBuilder(Rule17.MODIFIER_BLOCK);
        final List<Node> list = new LinkedList<>();
        list.add(Rule17.thirdBuilder(factory, data));
        list.add(Rule17.fourthBuilder(factory, data));
        final boolean applied = builder.setChildrenList(list);
        if (applied && builder.isValid()) {
            result = builder.createNode();
        }
        return result;
    }

    /**
     * Builds a node with 'Modifier' type.
     * @param factory The node factory
     * @param data The data
     * @return A node
     */
    private static Node thirdBuilder(final Factory factory, final Map<Integer, String> data) {
        Node result = EmptyTree.INSTANCE;
        final Builder builder = factory.createBuilder(Rule17.MODIFIER);
        final boolean set = builder.setData(data.get(1));
        if (set && builder.isValid()) {
            result = builder.createNode();
        }
        return result;
    }

    /**
     * Builds a node with 'Modifier' type.
     * @param factory The node factory
     * @param data The data
     * @return A node
     */
    private static Node fourthBuilder(final Factory factory, final Map<Integer, String> data) {
        Node result = EmptyTree.INSTANCE;
        final Builder builder = factory.createBuilder(Rule17.MODIFIER);
        final boolean set = builder.setData(data.get(2));
        if (set && builder.isValid()) {
            result = builder.createNode();
        }
        return result;
    }

    /**
     * Builds a node with 'ParameterBlock' type.
     * @param factory The node factory
     * @param children The collection of child nodes
     * @return A node
     */
    private static Node fifthBuilder(final Factory factory,
        final Map<Integer, List<Node>> children) {
        Node result = EmptyTree.INSTANCE;
        final Builder builder = factory.createBuilder(Rule17.PARAMETER_BLOCK);
        final List<Node> list = children.get(4);
        final boolean applied = builder.setChildrenList(list);
        if (applied && builder.isValid()) {
            result = builder.createNode();
        }
        return result;
    }
}
