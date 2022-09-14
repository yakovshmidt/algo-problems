package kz.home.ys.algo.medium.implementTrie;

class ImplementTrie {

    private final TrieNode trieNode;

    public ImplementTrie() {
        trieNode = new TrieNode();
    }

    // time - O(N)
    // space - O(N)
    public void insert(String word) {
        char[] letters = word.toCharArray();
        TrieNode curr = trieNode;
        for (char letter : letters) {
            if (!curr.containsKey(letter)) {
                curr.put(letter, new TrieNode());
            }
            curr = curr.get(letter);
        }
        curr.setEnd();
    }

    // time - O(N)
    // space - O(1)
    public boolean search(String word) {
        char[] letters = word.toCharArray();
        TrieNode curr = trieNode;
        for (char letter : letters) {
            if (curr.containsKey(letter)) {
                curr = curr.get(letter);
            } else {
                return false;
            }
        }

        return curr.isEnd();
    }

    // time - O(N)
    // space - O(1)
    public boolean startsWith(String prefix) {
        char[] letters = prefix.toCharArray();
        TrieNode curr = trieNode;
        for (char letter : letters) {
            if (curr.containsKey(letter)) {
                curr = curr.get(letter);
            } else {
                return false;
            }
        }
        return true;
    }

    static class TrieNode {

        private final TrieNode[] links;
        private final static int R = 26;
        private boolean isEnd;

        public TrieNode() {
            links = new TrieNode[R];
        }

        public boolean containsKey(char ch) {
            return links[ch - 'a'] != null;
        }

        public TrieNode get(char ch) {
            return links[ch - 'a'];
        }

        public void put(char ch, TrieNode node) {
            links[ch - 'a'] = node;
        }

        public void setEnd() {
            isEnd = true;
        }

        public boolean isEnd() {
            return isEnd;
        }
    }
}