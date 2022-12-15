package kz.home.ys.algo.google.googleInterviewLeetCodePremium.treesAndGraphs.countCompleteTreeNodes;

class CountCompleteTreeNodes {

    // time - O(log(N) * log(N))
    // space - O(1) - if we do not consider space of stack
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = calculateLeftDepth(root);
        int rightDepth = calculateRightDepth(root);
        if (leftDepth == rightDepth) {
            return (int) Math.pow(2, leftDepth) - 1;
        } else {
            return countNodes(root.left) + countNodes(root.right) + 1;
        }
    }

    private int calculateLeftDepth(TreeNode node) {
        int count = 0;
        while (node != null) {
            node = node.left;
            count++;
        }
        return count;
    }

    private int calculateRightDepth(TreeNode node) {
        int count = 0;
        while (node != null) {
            node = node.right;
            count++;
        }
        return count;
    }
}