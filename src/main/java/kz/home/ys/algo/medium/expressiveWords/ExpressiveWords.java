package kz.home.ys.algo.medium.expressiveWords;

class ExpressiveWords {
    
    public int expressiveWords(String s, String[] words) {
        int result = 0;
        
        for (String word : words) {
            if (isStretchy(s, word)) result++;
        }

        return result;
    }

    private boolean isStretchy(String s, String word) {
        int sIndex = 0;
        int wordIndex = 0;
        while (sIndex < s.length() && wordIndex < word.length()) {
            int sLetters = 1;
            char sChar = s.charAt(sIndex);
            while (sIndex + sLetters < s.length() && s.charAt(sIndex + sLetters) == sChar) {
                sLetters++;
            }

            int wordLetters = 1;
            char wordChar = word.charAt(wordIndex);
            while (wordIndex + wordLetters < word.length() && word.charAt(wordIndex + wordLetters) == wordChar) {
                wordLetters++;
            }

            if (sChar != wordChar) {
                return false;
            } else if (sLetters == 2 && wordLetters == 1) {
                return false;
            } else if (sLetters < wordLetters) {
                return false;
            }
            sIndex += sLetters;
            wordIndex += wordLetters;
        }

        return sIndex == s.length() && wordIndex == word.length();
    }
}











