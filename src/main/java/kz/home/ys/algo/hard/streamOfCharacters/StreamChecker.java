package kz.home.ys.algo.hard.streamOfCharacters;

import java.util.*;

// How much time have I spent, end-to-end?
// 1.5 hour. I came up with a solution fast, but tried to use an array instead of the deque, it took me a huge amount of time and finially I decided to go back to a solution with deque.

// What were the trickiest aspects? Where did you lose the most time?
// The trickiest aspect was to add word into the Trie in a reverse order.

// What are some lessons/insights I gained from this problem?
// Using Trie with reversed words.

// What would I do differently if I had extra time? What’s remaining to improve?
// IDK

// What did I do well?
// I decided to use correct Trie data structure at the beginning. Also, I implemented Trie really fast.

// Did you use any hints, if yes, what? (please do not give up and look up the hints quickly. if you do need to look up the hints, only use the ones given on the problem page one by one, and DON'T look at youtube videos or full solutions, until you try really hard)
// No, I didn't

// How difficult was the problem (1 super trivial, 10 extremely difficult) (answer this question three times separately for a) implementing quickly b) finding the right approach c) overall)
// a) 5 b) 5 c) 5

// What's the time & space complexity?
// M - is max word length
// N - is number of words
// Time:
// - O(N*M) to construct Trie + O(N) to find maxWordLength -> O(N*M)
// - O(M) to check whether word is into the Trie
// Space:
// - O(N*M) to construct the Trie
// - O(M) to construct the Deque
class StreamChecker {

    private final Trie trie;
    private final Deque<Character> stream;
    private int maxWordLength;

    public StreamChecker(String[] words) {
        this.trie = new Trie(words);
        this.stream = new ArrayDeque<>();
        for (String word : words) maxWordLength = Math.max(maxWordLength, word.length());
    }

    public boolean query(char letter) {
        stream.addFirst(letter);
        if (stream.size() > maxWordLength) stream.removeLast();

        TrieNode node = trie.root;
        for (char currLetter : stream) {
            if (node.isWord) return true;
            if (!node.children.containsKey(currLetter)) {
                return false;
            }
            node = node.children.get(currLetter);
        }
        return node.isWord;
    }

    static class Trie {
        TrieNode root = new TrieNode();

        public Trie(String[] words) {
            for (String word : words) addWord(new StringBuilder(word).reverse().toString());
        }

        private void addWord(String word) {
            TrieNode node = root;
            for (char letter : word.toCharArray()) {
                if (!node.children.containsKey(letter)) {
                    node.children.put(letter, new TrieNode());
                }
                node = node.children.get(letter);
            }
            node.isWord = true;
        }
    }

    static class TrieNode {
        public Map<Character, TrieNode> children = new HashMap<>();
        public boolean isWord = false;
    }
}

/**
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker obj = new StreamChecker(words);
 * boolean param_1 = obj.query(letter);
 */