package kz.home.ys.algo.google.googleInterviewLeetCodePremium.arraysAndStrings.plusOne;

class PlusOneLeetCode {

    // time - O(N)
    // space - O(N)
    public int[] plusOne(int[] digits) {
        int L = digits.length;

        for (int idx = L - 1; idx >= 0; idx--) {
            if (digits[idx] == 9) {
                digits[idx] = 0;
            } else {
                digits[idx]++;
                return digits;
            }
        }

        digits = new int[L + 1];
        digits[0] = 1;
        return digits;
    }
}