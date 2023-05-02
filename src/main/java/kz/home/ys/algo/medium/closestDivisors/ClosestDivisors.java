package kz.home.ys.algo.medium.closestDivisors;

class ClosestDivisors {
    public int[] closestDivisors(int num) {
        for (int i = (int)Math.sqrt(num + 2); i >= 0; i--) {
            if ((num + 1) % i == 0) {
                return new int[] {i, (num + 1) / i};
            } else if ((num + 2) % i == 0) {
                return new int[] {i, (num + 2) / i};
            }
        }
        return new int[0];
    }
}