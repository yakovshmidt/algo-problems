package kz.home.ys.algo.easy.closestBinarySearchTreeValue;

import kz.home.ys.algo.helper.TreeNode;

class ClosestBinarySearchTreeValue {
    
    private int closest = Integer.MAX_VALUE;
    
    public int closestValue(TreeNode root, double target) {
        if (root == null) return closest;
        double currAbs = Math.abs(root.val - target);
        double closestAbs = Math.abs(closest - target);
        if (currAbs < closestAbs) {
            closest = root.val;
        } else if (currAbs == closestAbs) {
            closest = Math.min(closest, root.val);
        }
        if (target < root.val) closestValue(root.left, target);
        else closestValue(root.right, target);

        return closest;
    }
}