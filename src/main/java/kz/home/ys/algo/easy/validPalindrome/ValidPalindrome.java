package kz.home.ys.algo.easy.validPalindrome;

import java.util.ArrayList;
import java.util.List;

class ValidPalindrome {

    // time - O(N) + O(N) -> O(N)
    // space - O(N)
    public boolean isPalindrome(String s) {
        // 0-9 - 48-57
        // upper - 65-90
        // lower - 97-122
        
        List<Character> upperCaseSentence = new ArrayList<>();
        for (char letter : s.toCharArray()) {
            if (letter >= 48 && letter <= 57) {  // letter is number
                upperCaseSentence.add(letter);
            } else if (letter >= 97 && letter <= 122) {  // letter is in lower case
                upperCaseSentence.add((char) ((int)letter - 32));
            } else if (letter >= 65 && letter <= 90) {  // letter is in upper case
                upperCaseSentence.add(letter);
            }
        }

        int l = 0;
        int r = upperCaseSentence.size() - 1;
        while (l < r) {
            if (!upperCaseSentence.get(l).equals(upperCaseSentence.get(r))) return false;
            
            l++;
            r--;
        }
        
        return true;
    }
}