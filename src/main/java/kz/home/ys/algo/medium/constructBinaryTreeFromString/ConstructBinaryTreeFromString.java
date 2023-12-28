package kz.home.ys.algo.medium.constructBinaryTreeFromString;

import kz.home.ys.algo.helper.TreeNode;

class ConstructBinaryTreeFromString {

    public TreeNode str2tree(String s) {
        return constructTree(s, 0, s.length());
    }

    // 4(2(3)(1))(6(5))
    private TreeNode constructTree(String s, int startIdx, int endIdx) {
        if (startIdx >= endIdx) return null;

        int i = startIdx;
        while (i < endIdx && (s.charAt(i) == '-' || Character.isDigit(s.charAt(i)))) {
            i++;
        }
        if (i == startIdx) return null;
        int num = Integer.parseInt(s.substring(startIdx, i));
        TreeNode node = new TreeNode(num);
        startIdx = i;
        int bracketsCount = (startIdx < endIdx && s.charAt(i) == '(') ? 1 : 0;
        startIdx++;
        i = startIdx;
        while (i < endIdx && bracketsCount > 0) {
            if (s.charAt(i) == '(') bracketsCount++;
            else if (s.charAt(i) == ')') bracketsCount--;
            if (bracketsCount == 0) node.left = constructTree(s, startIdx, i);
            i++;
        }
        startIdx = i;

        bracketsCount = (startIdx < endIdx && s.charAt(i) == '(') ? 1 : 0;
        startIdx++;
        i = startIdx;
        while (i < endIdx && bracketsCount > 0) {
            if (s.charAt(i) == '(') bracketsCount++;
            else if (s.charAt(i) == ')') bracketsCount--;
            if (bracketsCount == 0) node.right = constructTree(s, startIdx, i);
            i++;
        }

        return node;
    }
}