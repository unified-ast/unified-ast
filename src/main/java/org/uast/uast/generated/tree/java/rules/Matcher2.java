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
public final class Matcher2 implements Matcher {
    /**
     * The instance.
     */
    public static final Matcher INSTANCE = new Matcher2();

    /**
     * Expected node type.
     */
    private static final String EXPECTED_TYPE = "BinaryExpr";

    /**
     * Expected number of child nodes.
     */
    private static final int EXPECTED_COUNT = 2;

    /**
     * Expected data.
     */
    private static final String EXPECTED_DATA = "-";

    /**
     * The number of the first hole.
     */
    private static final int FIRST_HOLE_ID = 1;

    /**
     * The index of the first child.
     */
    private static final int FIRST_CHILD_ID = 0;

    /**
     * The number of the second hole.
     */
    private static final int SECOND_HOLE_ID = 2;

    /**
     * The index of the second child.
     */
    private static final int SECOND_CHILD_ID = 1;

    /**
     * Constructor.
     */
    private Matcher2() {
    }

    @Override
    public boolean match(final Node node,
        final Map<Integer, List<Node>> children,
        final Map<Integer, String> data) {
        final boolean result = node.belongsToGroup(Matcher2.EXPECTED_TYPE)
            && node.getChildCount() == Matcher2.EXPECTED_COUNT
            && Matcher2.EXPECTED_DATA.equals(node.getData());
        if (result) {
            children.put(
                Matcher2.FIRST_HOLE_ID,
                Collections.singletonList(node.getChild(Matcher2.FIRST_CHILD_ID))
            );
            children.put(
                Matcher2.SECOND_HOLE_ID,
                Collections.singletonList(node.getChild(Matcher2.SECOND_CHILD_ID))
            );
        }
        return result;
    }
}
