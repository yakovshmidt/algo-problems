package kz.home.ys.algo.easy.mergeStringsAlternately;

class MergeStringsAlternately {

    // time - O(MAX(N, M))
    // space - O(N + M)
    public String mergeAlternately(String word1, String word2) {
        // 1. get min length idx
        // 2. merge words before minLengthIdx
        // 3. add remaining part

        StringBuilder sb = new StringBuilder();

        // "abcd" -> 4 chars, word2 = "pq" -> 2 chars 
        int minLengthIdx = Math.min(word1.length(), word2.length()); // 2
        for (int i = 0; i < minLengthIdx; i++) { // 0 < 2, -> 1, 2
            sb.append(word1.charAt(i)); // a b
            sb.append(word2.charAt(i)); //  p q
        }

        if (word1.length() == word2.length()) return sb.toString();

        String maxWord = word1.length() > word2.length() ? word1 : word2; // word1
        sb.append(maxWord.substring(minLengthIdx));

        return sb.toString();
    }
}