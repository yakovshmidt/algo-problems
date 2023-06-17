package kz.home.ys.algo.easy.lengthOfLastWord;

class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        /* 
        
        Constraints:
        * 1 <= s.length <= 10^4
        * s consist of English letters only and spaces
        * there will be at least one word in s

        Approach 1:
        1) iterate over the s
        2) if iterator found a letter -> start calculating length of the word, otherwise go on to the next one
        time - O(N)
        space - O(1)

        Approach 2:
        1) iterate once and find all indices of spaces
        2) take 2 last ones
        3) execute substring(second idx from the end, last idx)
        time - O(N)
        space - O(1)

        Time: O(N)

        Space: O(1)
        
        */


        int wordLength = 0;
        boolean isWordFound = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            char letter = s.charAt(i);
            if (Character.isLetter(letter)) {
                if (!isWordFound) isWordFound = true;
                wordLength++;
            } else if (isWordFound && letter == ' ') {
                break;
            }
        }
        return wordLength;
    }
}

















