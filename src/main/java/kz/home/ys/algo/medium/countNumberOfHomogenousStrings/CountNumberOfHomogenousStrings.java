package kz.home.ys.algo.medium.countNumberOfHomogenousStrings;

class CountNumberOfHomogenousStrings {
    public int countHomogenous(String s) {
        /*
        
        a|bb|ccc|aa

        a -> 1
        bb -> b, bb
        c -> c,cc,ccc,cc
        
        zzzzz

        z -> zz,zzz,zzzz,zzzzz 
        z ->
        z ->
        z ->
        z ->

        z is 5 -> 5,4,3,2,1
        b is 2 -> 2,1

        time - O(N)
        space - O(1)

        */

        int mod = 1_000_000_007;
        int l = 0;
        int r = 0;
        int result = 0;
        while (l < s.length()) {
            while (r < s.length() && s.charAt(l) == s.charAt(r)) {
                r++;
            }

            int count = r - l;
            while (count > 0) {
                result += count;
                result %= mod;
                count--;
            }
            l = r;
        }

        return result;
    }
}