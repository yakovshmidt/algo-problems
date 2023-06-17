package kz.home.ys.algo.easy.reverseWordsInAStringIII;

class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int l = 0;
        int r = 0;
        while (l < s.length()) {
            while (r < s.length() && s.charAt(r) != ' ') {
                r++;
            }
            for (int i = r - 1; i >= l; i--) {
                sb.append(s.charAt(i));
            }
            if (r < s.length()) sb.append(' ');
            r++;
            l = r;
        }
        return sb.toString();
    }
}