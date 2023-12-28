package kz.home.ys.algo.medium.constructKPalindromeStrings;

class ConstructKPalindromeStrings {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) return false;

        int[] alphabet = new int[26];
        for (char letter : s.toCharArray()) {
            alphabet[letter - 97]++;
        }

        int odd = 0;
        for (int count : alphabet) {
            if (count == 0) continue;
            if (count % 2 != 0) odd++;
        }
        return odd <= k;
    }
}