package kz.home.ys.algo.medium.minimumSuffixFlips;

class MinimumSuffixFlips {

    // time - O(N)
    // space - O(1)
    public int minFlips(String target) {
        int numOfFlips = 0;
        boolean isZero = true;
        for (int i = 0; i < target.length(); i++) {
            char bit = target.charAt(i);
            if (bit == '1' && isZero) {
                numOfFlips++;
                isZero = false;
            } else if (bit == '0' && !isZero) {
                numOfFlips++;
                isZero = true;
            }
        }
        return numOfFlips;
    }
}