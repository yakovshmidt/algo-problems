package kz.home.ys.algo.easy.reverseVowelsOfAString;

import java.util.HashSet;
import java.util.Set;

class ReverseVowelsOfAString {

    private final Set<Character> vowels = new HashSet<>();

    public String reverseVowels(String s) {
        /*
        
        l e e t c o d e

        Approach 1: LinkedList

        e <-> e <-> o <-> e

        Approach 1:
        1. create an array of s
        2. using two pointers iterate s
        l e e t c o d e
              |
              |

        N is s.length()
        Time: O(N)
        Space: O(N)
        
        */
        this.vowels.add('a');
        this.vowels.add('e');
        this.vowels.add('i');
        this.vowels.add('o');
        this.vowels.add('u');
        this.vowels.add('A');
        this.vowels.add('E');
        this.vowels.add('I');
        this.vowels.add('O');
        this.vowels.add('U');

        char[] sArr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) sArr[i] = s.charAt(i);

        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (vowels.contains(s.charAt(left))) {
                if (vowels.contains(s.charAt(right))) {
                    swap(sArr, left++, right--);
                } else right--;
            } else left++;
        }

        return new String(sArr);
    }

    private void swap(char[] sArr, int left, int right) {
        char leftVowel = sArr[left];
        char rightVowel = sArr[right];
        sArr[left] = rightVowel;
        sArr[right] = leftVowel;
    }
}