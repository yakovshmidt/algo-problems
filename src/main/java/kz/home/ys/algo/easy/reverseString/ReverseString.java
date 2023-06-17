package kz.home.ys.algo.easy.reverseString;

class ReverseString {

    // time - O(N)
    // space - O(1)
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}