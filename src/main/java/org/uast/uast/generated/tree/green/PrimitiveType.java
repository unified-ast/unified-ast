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
import org.uast.uast.base.EmptyFragment;
import org.uast.uast.base.Fragment;
import org.uast.uast.base.Node;
import org.uast.uast.base.Type;

/**
 * Node that describes the 'PrimitiveType' type.
 *
 * @since 1.0
 */
public final class PrimitiveType implements TypeName {
    /**
     * The type.
     */
    public static final Type TYPE = new TypeImpl();

    /**
     * The fragment associated with the node.
     */
    private Fragment fragment;

    /**
     * The data.
     */
    private String data;

    /**
     * Constructor.
     */
    private PrimitiveType() {
    }

    @Override
    public Type getType() {
        return PrimitiveType.TYPE;
    }

    @Override
    public Fragment getFragment() {
        return this.fragment;
    }

    @Override
    public String getData() {
        return this.data;
    }

    @Override
    public int getChildCount() {
        return 0;
    }

    @Override
    public Node getChild(final int index) {
        throw new IndexOutOfBoundsException();
    }

    /**
     * Type descriptor of the 'PrimitiveType' node.
     *
     * @since 1.0
     */
    private static class TypeImpl implements Type {
        /**
         * The 'PrimitiveType' string.
         */
        private static final String PRIMITIVE_TYPE = "PrimitiveType";

        /**
         * The 'TypeName' string.
         */
        private static final String TYPE_NAME = "TypeName";

        /**
         * Hierarchy.
         */
        private static final List<String> HIERARCHY =
            Collections.unmodifiableList(
                Arrays.asList(
                    TypeImpl.PRIMITIVE_TYPE,
                    TypeImpl.TYPE_NAME
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
            return TypeImpl.PRIMITIVE_TYPE;
        }

        @Override
        public List<ChildDescriptor> getChildTypes() {
            return Collections.emptyList();
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
     * Class for 'PrimitiveType' node construction.
     *
     * @since 1.0
     */
    public static final class Constructor implements Builder {
        /**
         * The fragment associated with the node.
         */
        private Fragment fragment = EmptyFragment.INSTANCE;

        /**
         * The flag indicating that the builder has been initialized.
         */
        private boolean initialized;

        /**
         * The data.
         */
        private String data;

        @Override
        public void setFragment(final Fragment obj) {
            this.fragment = obj;
        }

        @Override
        public boolean setData(final String value) {
            this.data = value;
            this.initialized = true;
            return true;
        }

        @Override
        public boolean setChildrenList(final List<Node> list) {
            return list.isEmpty();
        }

        @Override
        public boolean isValid() {
            return this.initialized;
        }

        @Override
        public PrimitiveType createNode() {
            final PrimitiveType node = new PrimitiveType();
            node.fragment = this.fragment;
            node.data = this.data;
            return node;
        }
    }
}
