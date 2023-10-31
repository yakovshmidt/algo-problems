package kz.home.ys.algo.medium.removeDuplicateLetters;

import java.util.*;

class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        Set<Character> seen = new HashSet<>();
        Map<Character, Integer> lastOccurrence = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastOccurrence.put(s.charAt(i), i); 
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!seen.contains(c)) {
                while (!stack.isEmpty() && c < stack.peek() && lastOccurrence.get(stack.peek()) > i) {
                    seen.remove(stack.pop());
                }
                seen.add(c);
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}