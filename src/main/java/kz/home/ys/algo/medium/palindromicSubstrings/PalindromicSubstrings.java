package kz.home.ys.algo.medium.palindromicSubstrings;

class PalindromicSubstrings {
    
    // time - O(N^2)
    // space - O(1)
    public int countSubstrings(String s) {
        int numberOfPalindromes = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int l = i;
            int r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                numberOfPalindromes++;
                l--;
                r++;
            }
        }
        
        for (int i = 0; i < s.length(); i++) {
            int l = i;
            int r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                numberOfPalindromes++;
                l--;
                r++;
            }
        }
        
        return numberOfPalindromes;
    }
    
}