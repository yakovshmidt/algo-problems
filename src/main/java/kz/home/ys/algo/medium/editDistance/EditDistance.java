package kz.home.ys.algo.medium.editDistance;

class EditDistance {

    private Integer[][] memo;

    public int minDistance(String word1, String word2) {
        /*

        horse -> ros

        delete -> orse
        replace -> a,b,c,d,e,...,z
        if only word2 is greater then insert -> a,b,c,d,e,...,z

        */
        memo = new Integer[word1.length() + 1][word2.length() + 1];
        return minDistance(word1, word2, word1.length(), word2.length());
    }

    private int minDistance(String word1, String word2, int idx1, int idx2) {
        if (idx1 == 0) return idx2;
        if (idx2 == 0) return idx1;
        if (memo[idx1][idx2] != null) return memo[idx1][idx2];

        int minEditDistance;
        if (word1.charAt(idx1 - 1) == word2.charAt(idx2 - 1)) {
            minEditDistance = minDistance(word1, word2, idx1 - 1, idx2 - 1);
        } else {
            int insert = minDistance(word1, word2, idx1, idx2 - 1);
            int replace = minDistance(word1, word2, idx1 - 1, idx2 - 1);
            int delete = minDistance(word1, word2, idx1 - 1, idx2);

            minEditDistance = Math.min(insert, Math.min(replace, delete)) + 1;
        }
        memo[idx1][idx2] = minEditDistance;
        return minEditDistance;
    }
}