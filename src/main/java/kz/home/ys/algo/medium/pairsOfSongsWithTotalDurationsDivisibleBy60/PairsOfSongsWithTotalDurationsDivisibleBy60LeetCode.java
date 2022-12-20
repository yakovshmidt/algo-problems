package kz.home.ys.algo.medium.pairsOfSongsWithTotalDurationsDivisibleBy60;

class PairsOfSongsWithTotalDurationsDivisibleBy60LeetCode {

    // time - O(N)
    // space - O(1)
    public int numPairsDivisibleBy60(int[] time) {
        int[] remainders = new int[60];
        int count = 0;
        for (int t : time) {
            count += remainders[60 - t % 60];
            remainders[t % 60]++;
        }
        return count;
    }
}