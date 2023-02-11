package kz.home.ys.algo.medium.stepByStepDirectionsFromABinaryTreeNodeToAnother;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class StepByStepDirectionsFromABinaryTreeNodeToAnother {

    // time - O(N)
    // space - O(N) for childrenToParents + O(L) for max level inside deque
    public String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode start = null;
        TreeNode dest = null;
        int startLevel = -1;
        int destLevel = -1;

        Map<TreeNode, TreeNode> childrenToParents = new HashMap<>();
        childrenToParents.put(root, null);

        int level = 0;
        LinkedList<TreeNode> deque = new LinkedList<>();
        deque.addLast(root);

        while (!deque.isEmpty()) {
            level++;
            int size = deque.size();
            while (size > 0) {
                TreeNode curr = deque.removeFirst();

                if (curr.val == startValue) {
                    start = curr;
                    startLevel = level;
                } else if (curr.val == destValue) {
                    dest = curr;
                    destLevel = level;
                }

                if (curr.left != null) {
                    childrenToParents.put(curr.left, curr);
                    deque.addLast(curr.left);
                }

                if (curr.right != null) {
                    childrenToParents.put(curr.right, curr);
                    deque.addLast(curr.right);
                }

                size--;
            }

            if (startLevel != -1 && destLevel != -1) break;
        }

        StringBuilder startDirections = new StringBuilder();
        StringBuilder destDirections = new StringBuilder();

        while (startLevel != destLevel) {
            if (startLevel > destLevel) {
                TreeNode startParent = childrenToParents.get(start);
                startDirections.append("U");
                start = startParent;
                startLevel--;
            } else {
                TreeNode destParent = childrenToParents.get(dest);
                if (destParent.left == dest) {
                    destDirections.append("L");
                } else {
                    destDirections.append("R");
                }
                dest = destParent;
                destLevel--;
            }
        }

        while (start != dest) {
            TreeNode startParent = childrenToParents.get(start);
            System.out.println(startParent.val);
            startDirections.append("U");

            TreeNode destParent = childrenToParents.get(dest);
            System.out.println(destParent.val);
            if (destParent.left == dest) {
                destDirections.append("L");
            } else {
                destDirections.append("R");
            }

            start = startParent;
            dest = destParent;
        }

        return startDirections.toString() + destDirections.reverse();
    }
}
