package kz.home.ys.algo.easy.findUniqueCharacterInAString;

class FindUniqueCharacterInAString {

    // time - O(N)
    // space - O(1)
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            count[index]++;
        }
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (count[index] == 1) {
                return i;
            }
        }
        return -1;
    }
}