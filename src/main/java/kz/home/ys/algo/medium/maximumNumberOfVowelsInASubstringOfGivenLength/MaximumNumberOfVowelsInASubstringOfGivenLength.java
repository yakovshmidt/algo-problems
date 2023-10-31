package kz.home.ys.algo.medium.maximumNumberOfVowelsInASubstringOfGivenLength;

class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        /* 
        
        1 <= s.length <= 10^5
        1 <= k <= s.length
        s - only lowercase English letters

        Approach:
        abciiidef
         ---

        1) take abc, int currVowels = 1
        store maxVowels

        time - O(N)
        space - O(1)
        
        */

        boolean[] vowels = new boolean[26];
        vowels['a' - 'a'] = true;
        vowels['e' - 'a'] = true;
        vowels['i' - 'a'] = true;
        vowels['o' - 'a'] = true;
        vowels['u' - 'a'] = true;

        int currVowels = 0;
        int maxVowels = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i >= k && vowels[s.charAt(i - k) - 'a']) currVowels--;
            if (vowels[s.charAt(i) - 'a']) currVowels++;
            maxVowels = Math.max(maxVowels, currVowels);
            if (maxVowels == k) return k;
        }

        return maxVowels;
    }
}