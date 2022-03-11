package kz.home.ys.algo.medium.minHeightBst;

import java.util.List;

class MinHeightBst {

    public BST minHeightBst(List<Integer> array) {
        return constructMinHeightBst(array, 0, array.size() - 1);
    }

    private static BST constructMinHeightBst(List<Integer> array, int start, int end) {
        if (start > end) return null;
        int middle = start + (end - start) / 2;
        BST bst = new BST(array.get(middle));
        bst.left = constructMinHeightBst(array, start, middle - 1);
        bst.right = constructMinHeightBst(array, middle + 1, end);
        return bst;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
}

