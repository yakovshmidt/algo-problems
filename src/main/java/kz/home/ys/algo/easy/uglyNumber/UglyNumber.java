package kz.home.ys.algo.easy.uglyNumber;

class UglyNumber {
    public boolean isUgly(int n) {
        if (n == 0) return false;
        if (n == 1) return true;

        if (n % 2 == 0 && isUgly(n / 2)) return true;
        if (n % 3 == 0 && isUgly(n / 3)) return true;
        return n % 5 == 0 && isUgly(n / 5);
    }
}