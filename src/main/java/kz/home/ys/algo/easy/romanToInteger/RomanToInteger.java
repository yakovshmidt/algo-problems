package kz.home.ys.algo.easy.romanToInteger;

class RomanToInteger {

    // time - O(N)
    // space - O(1)
    public int romanToInt(String s) {
        int result = 0;
        int idx = 0;
        while (idx < s.length()) {
            char currRoman = s.charAt(idx);
            boolean isLastIdx = idx == s.length() - 1;
            int currInt = mapRomanToInt(currRoman);
            if (isLastIdx) {
                result += currInt;
                break;
            }

            char nextRoman = s.charAt(idx + 1);

            int nextInt = mapRomanToInt(nextRoman);
            if (currInt < nextInt) {
                result += (nextInt - currInt);
                idx++;
            } else {
                result += currInt;
            }
            idx++;
        }

        return result;
    }

    private int mapRomanToInt(char symbol) {
        if (symbol == 'M') return 1000;
        else if (symbol == 'D') return 500;
        else if (symbol == 'C') return 100;
        else if (symbol == 'L') return 50;
        else if (symbol == 'X') return 10;
        else if (symbol == 'V') return 5;
        else return 1;
    }
}