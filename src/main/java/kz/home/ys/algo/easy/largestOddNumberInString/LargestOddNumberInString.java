package kz.home.ys.algo.easy.largestOddNumberInString;

class LargestOddNumberInString {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - 48;
            if (digit % 2 == 1) return num.substring(0, i + 1);
        }

        return "";
    }
}