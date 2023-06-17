package kz.home.ys.algo.easy.findSmallestLetterGreaterThanTarget;

class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int r = letters.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (letters[m] <= target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return (l >= letters.length) ? letters[0] : letters[l];
    }
}