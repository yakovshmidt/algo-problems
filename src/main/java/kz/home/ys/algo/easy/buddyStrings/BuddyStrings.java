package kz.home.ys.algo.easy.buddyStrings;

class BuddyStrings {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;

        if (s.equals(goal)) {
            int[] frequency = new int[26];
            for (char letter : s.toCharArray()) {
                frequency[letter - 'a']++;
                if (frequency[letter - 'a'] == 2) return true;
            }
        }

        int firstIdx = -1;
        int secondIdx = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (firstIdx == -1) {
                    firstIdx = i;
                } else if (secondIdx == -1) {
                    secondIdx = i;
                } else {
                    return false;
                }
            }
        }

        if (secondIdx == -1) return false;

        return s.charAt(firstIdx) == goal.charAt(secondIdx) && s.charAt(secondIdx) == goal.charAt(firstIdx);
    }
}