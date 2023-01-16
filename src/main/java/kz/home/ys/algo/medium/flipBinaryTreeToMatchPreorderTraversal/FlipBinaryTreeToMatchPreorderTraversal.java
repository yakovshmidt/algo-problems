package kz.home.ys.algo.medium.flipBinaryTreeToMatchPreorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class FlipBinaryTreeToMatchPreorderTraversal {

    private final List<Integer> flipped;
    private int idx;

    public FlipBinaryTreeToMatchPreorderTraversal() {
        flipped = new ArrayList<>();
        idx = 0;
    }

    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        dfs(root, voyage);

        if (!flipped.isEmpty() && flipped.get(0) == -1) {
            flipped.clear();
            flipped.add(-1);
        }

        return flipped;
    }

    private void dfs(TreeNode root, int[] voyage) {
        if (root != null) {
            if (root.val != voyage[idx++]) {
                flipped.clear();
                flipped.add(-1);
                return;
            }

            if (idx < voyage.length && root.left != null && root.left.val != voyage[idx]) {
                flipped.add(root.val);
                dfs(root.right, voyage);
                dfs(root.left, voyage);
            } else {
                dfs(root.left, voyage);
                dfs(root.right, voyage);
            }
        }
    }
}
