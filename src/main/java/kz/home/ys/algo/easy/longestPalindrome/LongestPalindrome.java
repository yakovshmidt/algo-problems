package kz.home.ys.algo.easy.longestPalindrome;

class LongestPalindrome {

    // time - O(N)
    // space - O(1)
    public int longestPalindrome(String s) {
        int[] letters = new int[100];
        for (char letter : s.toCharArray()) {
            letters[letter - 65]++;
        }

        int numberOfEvens = 0;
        int numberOfOdds = 0;
        for (int letter : letters) {
            if (letter == 0) continue;
            if (letter % 2 == 0) {
                numberOfEvens += letter;
            } else {
                int reminder = letter % 2;
                numberOfEvens += (letter - reminder);
                numberOfOdds += reminder;
            }
        }
        return numberOfEvens + (numberOfOdds > 0 ? 1 : 0);
    }
}