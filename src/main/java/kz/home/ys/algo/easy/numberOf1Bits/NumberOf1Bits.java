package kz.home.ys.algo.easy.numberOf1Bits;

public class NumberOf1Bits {

    // you need to treat n as an unsigned value
    // time - O(32) - because int has size of 32
    // space - O(1)
    public int hammingWeight(int n) {
        int weight = 0;
        while (n != 0) {
            weight += n % 2;
            n = n >> 1;
        }
        return weight;
    }
}