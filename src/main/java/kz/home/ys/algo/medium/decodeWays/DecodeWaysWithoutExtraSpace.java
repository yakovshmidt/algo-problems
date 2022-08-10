package kz.home.ys.algo.medium.decodeWays;

class DecodeWaysWithoutExtraSpace {

    // time - O(N)
    // space - O(1)
    public int numDecodings(String s) {
        int first = 1;
        int second = s.charAt(0) == '0' ? 0 : 1;
        
        for (int i = 2; i <= s.length(); i++) {
            int temp = 0;
            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            if (oneDigit > 0) temp += second;
            
            int twoDigits = Integer.parseInt(s.substring(i - 2, i));
            if (twoDigits >= 10 && twoDigits <= 26) temp += first;
            
            first = second;
            second = temp;
        }
        
        return second;
    }
}