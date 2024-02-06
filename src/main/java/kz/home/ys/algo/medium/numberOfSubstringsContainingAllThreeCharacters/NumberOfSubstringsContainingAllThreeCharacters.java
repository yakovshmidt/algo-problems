package kz.home.ys.algo.medium.numberOfSubstringsContainingAllThreeCharacters;

class NumberOfSubstringsContainingAllThreeCharacters {
    public int numberOfSubstrings(String s) {
        int[] counts = new int[3];
        int l = 0;
        int r = 0;
        int result = 0;

        while (r < s.length()) {
            counts[s.charAt(r) - 97]++;

            while (containsAllThreeChars(counts)) {
                System.out.println(s.length() - r);
                result += (s.length() - r);
                counts[s.charAt(l) - 97]--;
                l++;
            }
            r++;
        }
        return result;
    }

    private boolean containsAllThreeChars(int[] counts) {
        return counts[0] >= 1 && counts[1] >= 1 && counts[2] >= 1;
    }
}