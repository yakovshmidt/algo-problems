package kz.home.ys.algo.easy.findTheIndexOfTheFirstOccurrenceInAString;

class FindTheIndexOfTheFirstOccurrenceInAStringWithKMP {
    public int strStr(String haystack, String needle) {
        int m = needle.length();
        int n = haystack.length();

        if (n < m) return -1;

        int[] longestBorder = new int[m];

        int prev = 0;
        int i = 1;

        while (i < m) {
            if (needle.charAt(i) == haystack.charAt(prev)) {
                prev++;
                longestBorder[i] = prev;
                i++;
            } else {
                if (prev == 0) {
                    longestBorder[i] = 0;
                    i++;
                } else {
                    prev = longestBorder[prev - 1];
                }
            }
        }

        int haystackPointer = 0;
        int needlePointer = 0;

        while (haystackPointer < n) {
            if (haystack.charAt(haystackPointer) == needle.charAt(needlePointer)) {
                needlePointer++;
                haystackPointer++;

                if (needlePointer == m) {
                    return haystackPointer - m;
                }
            } else {
                if (needlePointer == 0) {
                    haystackPointer++;
                } else {
                    needlePointer = longestBorder[needlePointer - 1];
                }
            }
        }

        return -1;
    }
}