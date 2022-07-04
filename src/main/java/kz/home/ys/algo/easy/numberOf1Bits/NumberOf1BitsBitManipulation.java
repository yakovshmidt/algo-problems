package kz.home.ys.algo.easy.numberOf1Bits;

public class NumberOf1BitsBitManipulation {

    // you need to treat n as an unsigned value
    // time - O(N) - where N is number of 1s
    // space - O(1)
    public int hammingWeight(int n) {
        int weight = 0;
        while (n != 0) {
            n = n & (n - 1);
            weight++;
        }
        return weight;
    }
}