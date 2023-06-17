package kz.home.ys.algo.easy.repeatedSubstringPattern;

class RepeatedSubstringPatternLeetCode {

    // time - O(N/2) * O(N/I)
    // space - O(N)
    public boolean repeatedSubstringPattern(String s) {
        // abcaabca
        // take a -> compare with remaining part

        int l = s.length();
        for (int i = l / 2; i >= 1; i--) {
            if (l % i == 0) {
                int m = l / i;
                String subS = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                sb.append(subS.repeat(m));
                if (sb.toString().equals(s)) return true;
            }
        }
        return false;
    }
}