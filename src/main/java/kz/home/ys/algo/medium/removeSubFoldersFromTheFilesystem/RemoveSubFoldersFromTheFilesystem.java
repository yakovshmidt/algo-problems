package kz.home.ys.algo.medium.removeSubFoldersFromTheFilesystem;

import java.util.*;

class RemoveSubFoldersFromTheFilesystem {

    static class Trie {

        private final TrieNode node = new TrieNode();

        public void addPaths(String[] folder) {
            for (String path : folder) {
                TrieNode curr = node;
                String[] splitPath = path.split("\\/");
                for (String subPath : splitPath) {
                    if (!curr.children.containsKey(subPath)) {
                        curr.children.put(subPath, new TrieNode());
                    }
                    curr = curr.children.get(subPath);
                }
                curr.path = path;
            }
        }

        public List<String> getParents() {
            List<String> result = new ArrayList<>();
            Stack<TrieNode> stack = new Stack<>();
            stack.push(node);
            while (!stack.isEmpty()) {
                TrieNode node = stack.pop();
                if (node.path != null) {
                    result.add(node.path);
                } else {
                    for (TrieNode nodes : node.children.values()) {
                        stack.push(nodes);
                    }
                }
            }
            return result;
        }
    }

    static class TrieNode {
        public Map<String, TrieNode> children = new HashMap<>();
        public String path;
    }

    public List<String> removeSubfolders(String[] folder) {
        Trie trie = new Trie();
        trie.addPaths(folder);
        return trie.getParents();
    }
}