package kz.home.ys.algo.medium.powXN;

class PowXNIterative {

    public double myPow(double x, long n) {
        if (n == 0) return 1;
        if (n < 0) {
            x = 1 / x;
            n = -1 * n;
        }

        double result = 1;
        while (n != 0) {
            if (n % 2 == 1) {
                result = x * result;
                n -= 1;
            }

            x = x * x;
            n = n / 2;
        }

        return result;
    }
}