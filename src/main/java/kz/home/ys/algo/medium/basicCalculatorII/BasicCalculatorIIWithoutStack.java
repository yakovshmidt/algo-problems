package kz.home.ys.algo.medium.basicCalculatorII;

class BasicCalculatorIIWithoutStack {
    public int calculate(String s) {
        /*
        
        Constraints:
        1) 1 <= s.length() <= 3 * 10e5
        2) letters in s
        3) is s always valid?

        Approach:

        Time: O(N)
        Space: O(N)
        
        */
        if (s == null || s.isEmpty()) return 0;

        int currNumber = 0;
        int prevNumber = 0;
        char operator = '+';
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (Character.isDigit(ch)) {
                currNumber = (currNumber * 10) + (ch - '0');
            }
            if (!Character.isDigit(ch) && !Character.isWhitespace(ch) || i == s.length() - 1) {
                if (operator == '-') {
                    result += prevNumber;
                    prevNumber = -currNumber;
                } else if (operator == '+') {
                    result += prevNumber;
                    prevNumber = currNumber;
                } else if (operator == '*') {
                    prevNumber = prevNumber * currNumber;
                } else if (operator == '/') {
                    prevNumber = prevNumber / currNumber;
                }
                operator = ch;
                currNumber = 0;
            }
        }

        return result + prevNumber;
    }
}