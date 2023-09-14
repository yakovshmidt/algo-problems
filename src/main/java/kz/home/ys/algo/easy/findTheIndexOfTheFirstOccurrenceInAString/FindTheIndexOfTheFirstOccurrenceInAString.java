package kz.home.ys.algo.easy.findTheIndexOfTheFirstOccurrenceInAString;

class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            boolean contains = true;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    contains = false;
                    break;
                }
            }
            if (contains) return i;
        }
        return -1;
    }
}