package kz.home.ys.algo.easy.verifyingAnAlienDictionary;

class VerifyingAnAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {
        int maxWordLength = Integer.MIN_VALUE;
        for (String word : words) {
            maxWordLength = Math.max(maxWordLength, word.length());
        }

        outer: for (int i = 1; i < words.length; i++) {
            String word1 = words[i - 1];
            String word2 = words[i];
            for (int j = 0; j < Math.max(word1.length(), word2.length()); j++) {
                int order1 = j < word1.length() ? order.indexOf(word1.charAt(j)) : Integer.MIN_VALUE;
                int order2 = j < word2.length() ? order.indexOf(word2.charAt(j)) : Integer.MIN_VALUE;
                if (order1 < order2) {
                    continue outer;
                } else if (order2 < order1) {
                    return false;
                }
            }
        }
        return true;
    }
}