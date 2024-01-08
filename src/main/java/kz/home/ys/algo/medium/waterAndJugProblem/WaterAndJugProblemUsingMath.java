package kz.home.ys.algo.medium.waterAndJugProblem;

class WaterAndJugProblemUsingMath {

    public boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z) return false;
        int a = gcd(x, y);
        return z % a == 0;
    }

    private int gcd(int x, int y) {
        if (x == 0) return y;
        return gcd(y % x, x);
    }
}