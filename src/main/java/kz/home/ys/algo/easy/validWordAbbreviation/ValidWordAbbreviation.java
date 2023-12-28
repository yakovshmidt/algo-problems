package kz.home.ys.algo.easy.validWordAbbreviation;

class ValidWordAbbreviation {
    public boolean validWordAbbreviation(String word, String abbr) {
        int wordIdx = 0;
        int abbrIdx = 0;
        while (wordIdx < word.length()) {
            if (abbrIdx >= abbr.length()) return false;

            char wordLetter = word.charAt(wordIdx);
            char abbrLetter = abbr.charAt(abbrIdx);
            if (Character.isDigit(abbrLetter)) {
                if (abbrLetter == '0') return false;
                int abbrStartIdx = abbrIdx;
                int abbrEndIdx = abbrIdx;
                while (abbrEndIdx < abbr.length() && Character.isDigit(abbr.charAt(abbrEndIdx))) {
                    abbrEndIdx++;
                }
                int number = Integer.parseInt(abbr.substring(abbrStartIdx, abbrEndIdx));
                abbrIdx = abbrEndIdx;
                while (wordIdx < word.length() && number > 0) {
                    wordIdx++;
                    number--;
                }
                if (number != 0) return false;
            } else {
                if (wordLetter != abbrLetter) return false;
                wordIdx++;
                abbrIdx++;
            }
        }
        return true;
    }
}