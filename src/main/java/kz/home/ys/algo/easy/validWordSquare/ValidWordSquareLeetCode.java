package kz.home.ys.algo.easy.validWordSquare;

import java.util.List;

class ValidWordSquareLeetCode {
    public boolean validWordSquare(List<String> words) {
        /* 

        time - O(NUMBER_OF_WORDS * MAX(WORD_LENGTH))
        space - O(1)
        
        */

        for (int wordNum = 0; wordNum < words.size(); wordNum++) {
            for (int charPos = 0; charPos < words.get(wordNum).length(); charPos++) {
                if (charPos >= words.size() || wordNum >= words.get(charPos).length() || words.get(wordNum).charAt(charPos) != words.get(charPos).charAt(wordNum)) {
                    return false;
                }
            }
        }
        return true;
    }
}