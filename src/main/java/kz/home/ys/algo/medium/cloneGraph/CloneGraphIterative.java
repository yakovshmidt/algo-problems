package kz.home.ys.algo.medium.cloneGraph;

import java.util.*;

class CloneGraphIterative {

    // time - O(N)
    // space - O(N)
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        
        Map<Integer, Node> nodes = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        
        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            Node currCopy = nodes.containsKey(curr.val) ? nodes.get(curr.val) : new Node(curr.val);
            nodes.putIfAbsent(curr.val, currCopy);
            
            for (Node neighbour : curr.neighbors) {
                if (visited.contains(neighbour.val)) continue;
                
                stack.push(neighbour);
                Node neighbourCopy = nodes.containsKey(neighbour.val) ? nodes.get(neighbour.val) : new Node(neighbour.val);
                nodes.putIfAbsent(neighbourCopy.val, neighbourCopy);
                currCopy.neighbors.add(neighbourCopy);
                neighbourCopy.neighbors.add(currCopy);
            }
            visited.add(currCopy.val);
        }
        
        return nodes.get(1);
    }
}