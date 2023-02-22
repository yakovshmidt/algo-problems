package kz.home.ys.algo.easy.happyNumber;

class HappyNumber {

    private static final int MAX_NUMBER_OF_ITERATIONS = 10;
    public boolean isHappy(int n) {
        int loopIterations = 0;

        // time - O(MAX_NUMBER_OF_ITERATIONS * MAX(N))
        // space - O(1)
        while (loopIterations < MAX_NUMBER_OF_ITERATIONS) {
            int sum = 0;
            while (n != 0) {
                int lastDigit = n % 10;
                sum += (int) Math.pow(lastDigit, 2);
                n = n / 10;
            }

            if (sum == 1) return true;
            n = sum;
            loopIterations++;
        }
        return false;
    }
}