/*
 * MIT License Copyright (c) 2022 unified-ast
 * https://github.com/unified-ast/unified-ast/blob/master/LICENSE.txt
 */

package org.uast.uast.generated.tree.green;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.uast.uast.base.Builder;
import org.uast.uast.base.ChildDescriptor;
import org.uast.uast.base.ChildrenMapper;
import org.uast.uast.base.EmptyFragment;
import org.uast.uast.base.Fragment;
import org.uast.uast.base.ListUtils;
import org.uast.uast.base.Node;
import org.uast.uast.base.Type;

/**
 * Node that describes the 'Declarator' type.
 *
 * @since 1.0
 */
public final class Declarator implements Node {
    /**
     * The type.
     */
    public static final Type TYPE = new TypeImpl();

    /**
     * The number of children.
     */
    private static final int CHILD_COUNT = 2;

    /**
     * The fragment associated with the node.
     */
    private Fragment fragment;

    /**
     * List of child nodes.
     */
    private List<Node> children;

    /**
     * Child with the 'name' tag.
     */
    private Identifier name;

    /**
     * Child with the 'value' tag.
     */
    private Expression value;

    /**
     * Constructor.
     */
    private Declarator() {
    }

    @Override
    public Type getType() {
        return Declarator.TYPE;
    }

    @Override
    public Fragment getFragment() {
        return this.fragment;
    }

    @Override
    public String getData() {
        return "";
    }

    @Override
    public int getChildCount() {
        return Declarator.CHILD_COUNT;
    }

    @Override
    public Node getChild(final int index) {
        return this.children.get(index);
    }

    /**
     * Returns the child with the 'name' tag.
     * @return The node
     */
    public Identifier getName() {
        return this.name;
    }

    /**
     * Returns the child with the 'value' tag.
     * @return The node
     */
    public Expression getValue() {
        return this.value;
    }

    /**
     * Type descriptor of the 'Declarator' node.
     *
     * @since 1.0
     */
    private static class TypeImpl implements Type {
        /**
         * The 'Declarator' string.
         */
        private static final String DECLARATOR = "Declarator";

        /**
         * The 'Identifier' string.
         */
        private static final String IDENTIFIER = "Identifier";

        /**
         * The 'Expression' string.
         */
        private static final String EXPRESSION = "Expression";

        /**
         * The list of child types.
         */
        private static final List<ChildDescriptor> CHILDREN =
            Collections.unmodifiableList(
                Arrays.asList(
                    new ChildDescriptor(
                        TypeImpl.IDENTIFIER,
                        false
                    ),
                    new ChildDescriptor(
                        TypeImpl.EXPRESSION,
                        false
                    )
                )
            );

        /**
         * Hierarchy.
         */
        private static final List<String> HIERARCHY =
            Collections.unmodifiableList(
                Arrays.asList(
                    TypeImpl.DECLARATOR
                )
            );

        /**
         * Properties.
         */
        private static final Map<String, String> PROPERTIES = Stream.of(
            new String[][] {
                {"color", "green"},
                {"language", "common"},
            }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

        @Override
        public String getName() {
            return TypeImpl.DECLARATOR;
        }

        @Override
        public List<ChildDescriptor> getChildTypes() {
            return TypeImpl.CHILDREN;
        }

        @Override
        public List<String> getHierarchy() {
            return TypeImpl.HIERARCHY;
        }

        @Override
        public String getProperty(final String name) {
            return TypeImpl.PROPERTIES.getOrDefault(name, "");
        }

        @Override
        public Builder createBuilder() {
            return new Constructor();
        }
    }

    /**
     * Class for 'Declarator' node construction.
     *
     * @since 1.0
     */
    public static final class Constructor implements Builder {
        /**
         * The maximum number of nodes.
         */
        private static final int MAX_NODE_COUNT = 2;

        /**
         * The position of the 'name' field.
         */
        private static final int NAME_POS = 0;

        /**
         * The position of the 'value' field.
         */
        private static final int VALUE_POS = 1;

        /**
         * The fragment associated with the node.
         */
        private Fragment fragment = EmptyFragment.INSTANCE;

        /**
         * Node with the 'name' tag.
         */
        private Identifier name;

        /**
         * Node with the 'value' tag.
         */
        private Expression value;

        @Override
        public void setFragment(final Fragment obj) {
            this.fragment = obj;
        }

        @Override
        public boolean setData(final String str) {
            return str.isEmpty();
        }

        /**
         * Sets the node with the 'name' tag.
         * @param node The node
         */
        public void setName(final Identifier node) {
            this.name = node;
        }

        /**
         * Sets the node with the 'value' tag.
         * @param node The node
         */
        public void setValue(final Expression node) {
            this.value = node;
        }

        @Override
        public boolean setChildrenList(final List<Node> list) {
            final Node[] mapping = new Node[Constructor.MAX_NODE_COUNT];
            final ChildrenMapper mapper =
                new ChildrenMapper(Declarator.TYPE.getChildTypes());
            final boolean result = mapper.map(mapping, list);
            if (result) {
                this.name = (Identifier) mapping[Constructor.NAME_POS];
                this.value = (Expression) mapping[Constructor.VALUE_POS];
            }
            return result;
        }

        @Override
        public boolean isValid() {
            return this.name != null
                && this.value != null;
        }

        @Override
        public Declarator createNode() {
            if (!this.isValid()) {
                throw new IllegalStateException();
            }
            final Declarator node = new Declarator();
            node.fragment = this.fragment;
            node.children = new ListUtils<Node>()
                .add(
                    this.name,
                    this.value
                )
                .make();
            node.name = this.name;
            node.value = this.value;
            return node;
        }
    }
}
