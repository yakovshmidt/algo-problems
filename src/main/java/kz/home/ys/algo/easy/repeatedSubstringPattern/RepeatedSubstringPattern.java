package kz.home.ys.algo.easy.repeatedSubstringPattern;

class RepeatedSubstringPattern {

    // time - O(N^2)
    // space - O(N^2)
    public boolean repeatedSubstringPattern(String s) {
        String possibleSubstring = String.valueOf(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (repeatedSubstringPatternHelper(s, i, possibleSubstring)) {
                return true;
            }
            possibleSubstring += s.charAt(i);
        }

        return false;
    }
    
    private boolean repeatedSubstringPatternHelper(String s, int idx, String possibleSubstring) {
        if (idx >= s.length()) return true;
        if (possibleSubstring.length() + idx > s.length()) return false;

        if (possibleSubstring.equals(s.substring(idx, possibleSubstring.length() + idx))) {
            return repeatedSubstringPatternHelper(s, possibleSubstring.length() + idx, possibleSubstring);
        }
        return false;
    }
}