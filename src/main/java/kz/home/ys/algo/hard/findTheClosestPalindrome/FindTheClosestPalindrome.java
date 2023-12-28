package kz.home.ys.algo.hard.findTheClosestPalindrome;

class FindTheClosestPalindrome {
    public String nearestPalindromic(String n) {
        /*
        
        1) palindrome using the first half
        2) if middle is 9 -> increment to get a palindrome
        3) if middle is 0 -> decrement to get a palindrome
        4) get min of palindromes from 1, 2, and 3 steps 
        
        */

        long curr = Long.parseLong(n);
        long prev = previous(String.valueOf(curr - 1).toCharArray());
        long next = next(String.valueOf(curr + 1).toCharArray());
        return String.valueOf((next - curr < curr - prev) ? next : prev);
    }

    private long previous(char[] s) {
        for (int i = 0, n = s.length; i < (n >> 1); i++) {
            while (s[i] != s[n - i - 1]) {
                decrement(s, n - i - 1);
                if (s[0] == '0') return Long.parseLong(new String(s));
            }
        }
        return Long.parseLong(new String(s));
    }

    private void decrement(char[] s, int i) {
        while (s[i] == '0') s[i--] = '9';
        s[i]--;
    }

    private long next(char[] s) {
        for (int i = 0, n = s.length; i < (n >> 1); i++) {
            while (s[i] != s[n - i - 1]) {
                increment(s, n - i - 1);
            }
        }
        return Long.parseLong(new String(s));
    }

    private void increment(char[] s, int i) {
        while (s[i] == '9') s[i--] = '0';
        s[i]++;
    }
}