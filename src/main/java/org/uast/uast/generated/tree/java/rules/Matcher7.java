/*
 * MIT License Copyright (c) 2022 unified-ast
 * https://github.com/unified-ast/unified-ast/blob/master/LICENSE.txt
 */

package org.uast.uast.generated.tree.java.rules;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.uast.uast.base.Matcher;
import org.uast.uast.base.Node;

/**
 * Checks if the node matches some structure, and extracts the data and children.
 *
 * @since 1.0
 */
public final class Matcher7 implements Matcher {
    /**
     * The instance.
     */
    public static final Matcher INSTANCE = new Matcher7();

    /**
     * Expected node type.
     */
    private static final String EXPECTED_TYPE = "FieldAccessExpr";

    /**
     * Expected number of child nodes.
     */
    private static final int EXPECTED_COUNT = 2;

    /**
     * The number of the first hole.
     */
    private static final int FIRST_HOLE_ID = 2;

    /**
     * The index of the first child.
     */
    private static final int FIRST_CHILD_ID = 1;

    /**
     * Constructor.
     */
    private Matcher7() {
    }

    @Override
    public boolean match(final Node node,
        final Map<Integer, List<Node>> children,
        final Map<Integer, String> data) {
        final boolean result = node.belongsToGroup(Matcher7.EXPECTED_TYPE)
            && node.getChildCount() == Matcher7.EXPECTED_COUNT
            && Matcher8.INSTANCE.match(node.getChild(0), children, data);
        if (result) {
            children.put(
                Matcher7.FIRST_HOLE_ID,
                Collections.singletonList(node.getChild(Matcher7.FIRST_CHILD_ID))
            );
        }
        return result;
    }
}
