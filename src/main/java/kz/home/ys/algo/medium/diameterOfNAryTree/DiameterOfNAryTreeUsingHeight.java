package kz.home.ys.algo.medium.diameterOfNAryTree;

class DiameterOfNAryTreeUsingHeight {

    private int diameter = 0;

    public int diameter(Node root) {
        height(root);
        return diameter;
    }

    private int height(Node node) {
        if (node.children.isEmpty()) return 0;

        int heightOne = 0, heightTwo = 0;
        for (Node child : node.children) {
            int parentHeight = height(child) + 1;
            if (parentHeight > heightOne) {
                heightTwo = heightOne;
                heightOne = parentHeight;
            } else if (parentHeight > heightTwo) {
                heightTwo = parentHeight;
            }
            int distance = heightOne + heightTwo;
            diameter = Math.max(distance, diameter);
        } 
        return heightOne; 
    }
}