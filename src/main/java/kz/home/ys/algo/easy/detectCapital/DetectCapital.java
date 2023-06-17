package kz.home.ys.algo.easy.detectCapital;

class DetectCapital {

    // time - O(N)
    // space - O(1)
    public boolean detectCapitalUse(String word) {
        boolean isFirstLetterUpperCased = true;
        boolean allLettersAreLowerCased = true;
        boolean allLettersAreUpperCased = true;
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (isFirstLetterUpperCased) {
                if (i == 0) {
                    if (isLowerCaseLetter(letter)) isFirstLetterUpperCased = false;
                } else {
                    if (!isLowerCaseLetter(letter)) isFirstLetterUpperCased = false;
                }
            }
            if (allLettersAreLowerCased) {
                if (!isLowerCaseLetter(letter)) allLettersAreLowerCased = false;
            }
            if (allLettersAreUpperCased) {
                if (isLowerCaseLetter(letter)) allLettersAreUpperCased = false;
            }
        }

        return isFirstLetterUpperCased || allLettersAreLowerCased || allLettersAreUpperCased;
    }

    private boolean isLowerCaseLetter(char letter) {
        int letterAsInt = letter - 0;
        return letterAsInt >= 97 && letterAsInt <= 122;
    }
}