package kz.home.ys.algo.easy.numberOfSegmentsInAString;

class NumberOfSegmentsInAString {

    // time - O(N)
    // space - O(1)
    public int countSegments(String s) {
        boolean isWordFound = false;
        int numberOfSegments = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (!isWordFound) {
                    isWordFound = true;
                    numberOfSegments++;
                }
            } else {
                isWordFound = false;
            }
        }
        return numberOfSegments;
    }
}