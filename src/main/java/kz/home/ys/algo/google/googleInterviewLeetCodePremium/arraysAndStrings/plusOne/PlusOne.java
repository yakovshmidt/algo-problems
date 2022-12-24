package kz.home.ys.algo.google.googleInterviewLeetCodePremium.arraysAndStrings.plusOne;

class PlusOne {
    
    // time - O(N + 1)
    // space - O(N + 1)
    public int[] plusOne(int[] digits) {
        int L = digits.length - 1;
        int digit = 1;
        
        for (int idx = L; idx >= 0; idx--) {
            int sum = digits[idx] + digit;
            if (sum > 9) {
                digits[idx] = sum % 10;
                digit = 1;
            } else {
                digits[idx] = sum;
                digit = 0;
            }
        }
        
        if (digit == 0) {
            return digits;
        } else {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = digit;
            if (L >= 0) System.arraycopy(digits, 0, newDigits, 1, L);
            return newDigits;
        } 
    }
}