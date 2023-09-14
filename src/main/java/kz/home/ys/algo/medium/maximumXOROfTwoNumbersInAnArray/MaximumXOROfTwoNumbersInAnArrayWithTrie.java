package kz.home.ys.algo.medium.maximumXOROfTwoNumbersInAnArray;

import java.util.HashMap;
import java.util.Map;

public class MaximumXOROfTwoNumbersInAnArrayWithTrie {

    static class TrieNode {
        public Map<Character, TrieNode> children = new HashMap<>();
    }

    // time - O(N * M) - where N is number of nums and M is max length of binary num
    // space - O(M)
    public int findMaximumXOR(int[] nums) {
        int maxNum = nums[0];
        for (int num : nums) maxNum = Math.max(num, maxNum);
        int l = Integer.toBinaryString(maxNum).length();

        int maxXor = 0, bitmask = 1 << l;
        String[] bitNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            bitNums[i] = Integer.toBinaryString(bitmask | nums[i]).substring(1);
        }
        TrieNode trie = new TrieNode();
        for (String num : bitNums) {
            TrieNode node = trie, xorNode = node;
            int currXor = 0;
            for (char bit : num.toCharArray()) {
                if (!node.children.containsKey(bit)) {
                    node.children.put(bit, new TrieNode());
                }
                node = node.children.get(bit);

                char toggledBit = bit == '1' ? '0' : '1';
                if (xorNode.children.containsKey(toggledBit)) {
                    currXor = (currXor << 1) | 1;
                    xorNode = xorNode.children.get(toggledBit);
                } else {
                    currXor = currXor << 1;
                    xorNode = xorNode.children.get(bit);
                }
            }
            maxXor = Math.max(currXor, maxXor);
        }
        return maxXor;
    }
}