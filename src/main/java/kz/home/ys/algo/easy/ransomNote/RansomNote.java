package kz.home.ys.algo.easy.ransomNote;

class RansomNote {

    // time - O(N + M)
    // space - O(26) -> O(1)
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] magazineCount = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            magazineCount[magazine.charAt(i) - 97]++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            int letter = ransomNote.charAt(i) - 97;
            if (magazineCount[letter] <= 0) {
                return false;
            }
            magazineCount[letter]--;
        }

        return true;
    }
}