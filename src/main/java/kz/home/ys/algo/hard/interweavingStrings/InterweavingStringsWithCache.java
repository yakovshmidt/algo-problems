package kz.home.ys.algo.hard.interweavingStrings;

class InterweavingStringsWithCache {

    // time - O(N) - where N is length of third string
    // space - O(N)
    public boolean interweavingStrings(String one, String two, String three) {
        if (three.length() != one.length() + two.length()) {
            return false;
        }

        boolean[][] cache = new boolean[one.length() + 1][two.length() + 1];
        return isInterwoven(one, two, three, 0, 0, cache);
    }

    private boolean isInterwoven(String one,
                                 String two,
                                 String three,
                                 int i,
                                 int j,
                                 boolean[][] cache) {
        if (cache[i][j]) return true;

        int k = i + j;
        if (k == three.length()) return true;

        if (i < one.length() && one.charAt(i) == three.charAt(k)) {
            cache[i][j] = isInterwoven(one, two, three, i + 1, j, cache);
            if (cache[i][j]) return true;
        }

        if (j < two.length() && two.charAt(j) == three.charAt(k)) {
            cache[i][j] = isInterwoven(one, two, three, i, j + 1, cache);
            return cache[i][j];
        }

        return false;
    }
}


