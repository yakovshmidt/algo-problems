package kz.home.ys.algo.medium.sumOfTwoIntegers;

class SumOfTwoIntegers {

    // time - O(N) - where N is a carry
    // space - O(1)
    public int getSum(int a, int b) {
        while (b != 0) {
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
        }
        return a;
    }
}