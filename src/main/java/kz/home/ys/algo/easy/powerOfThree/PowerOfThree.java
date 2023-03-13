package kz.home.ys.algo.easy.powerOfThree;

class PowerOfThree {

    // time - O(log3(N))
    // space - O(1)
    public boolean isPowerOfThree(int n) {
        if (n < 1) return false;

        while (n % 3 == 0) {
            n = n / 3;
        }

        return n == 1;
    }
}