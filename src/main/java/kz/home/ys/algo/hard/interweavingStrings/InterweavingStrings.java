package kz.home.ys.algo.hard.interweavingStrings;

class InterweavingStrings {

    // time - O(2^N) - where N is length of third string
    // space - O(N)
    public boolean interweavingStrings(String one, String two, String three) {
        if (three.length() != one.length() + two.length()) {
            return false;
        }

        return isInterwoven(one, two, three, 0, 0);
    }

    private boolean isInterwoven(String one, String two, String three, int i, int j) {
        int k = i + j;
        if (k == three.length()) return true;

        if (i < one.length() && one.charAt(i) == three.charAt(k)) {
            boolean isInterwoven = isInterwoven(one, two, three, i + 1, j);
            if (isInterwoven) return true;
        }

        if (j < two.length() && two.charAt(j) == three.charAt(k)) {
            return isInterwoven(one, two, three, i, j + 1);
        }

        return false;
    }
}

