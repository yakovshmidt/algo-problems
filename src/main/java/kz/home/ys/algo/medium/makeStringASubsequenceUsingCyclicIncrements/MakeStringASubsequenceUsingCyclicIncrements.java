package kz.home.ys.algo.medium.makeStringASubsequenceUsingCyclicIncrements;

class MakeStringASubsequenceUsingCyclicIncrements {
    public boolean canMakeSubsequence(String str1, String str2) {
        if (str2.length() > str1.length()) return false;

        int str1Idx = 0;
        int str2Idx = 0;
        while (str1Idx < str1.length() && str2Idx < str2.length()) {
            char letter1 = str1.charAt(str1Idx);
            char letter2 = str2.charAt(str2Idx);

            if (letter1 == letter2) {
                str2Idx++;
            } else {
                int num1 = letter1 - 97;
                int num2 = letter2 - 97;
                num1 = num1 == 25 ? 0 : num1 + 1;
                if (num1 == num2) str2Idx++; 
            }
            str1Idx++;
        }

        return str2Idx == str2.length();
    }
}