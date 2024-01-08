package kz.home.ys.algo.medium.diameterOfNAryTree;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
        children = new ArrayList<>();
    }

    public Node(int _val) {
        val = _val;
        children = new ArrayList<Node>();
    }

    public Node(int val, ArrayList<Node> children) {
        this.val = val;
        this.children = children;
    }
};