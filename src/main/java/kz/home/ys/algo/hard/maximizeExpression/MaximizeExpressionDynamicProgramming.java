package kz.home.ys.algo.hard.maximizeExpression;

class MaximizeExpressionDynamicProgramming {

    // time - O(4*N) -> O(N)
    // space - O(4*N) -> O(N)
    public int maximizeExpression(int[] array) {
        if (array == null || array.length < 4) return 0;

        int[] maxOfA = new int[array.length];
        maxOfA[0] = array[0];

        int[] maxOfAMinusB = new int[array.length];
        maxOfAMinusB[0] = Integer.MIN_VALUE;

        int[] maxOfAMinusBPlusC = new int[array.length];
        maxOfAMinusBPlusC[0] = Integer.MIN_VALUE;
        maxOfAMinusBPlusC[1] = Integer.MIN_VALUE;

        int[] maxOfAMinusBPlusCMinusD = new int[array.length];
        maxOfAMinusBPlusCMinusD[0] = Integer.MIN_VALUE;
        maxOfAMinusBPlusCMinusD[1] = Integer.MIN_VALUE;
        maxOfAMinusBPlusCMinusD[2] = Integer.MIN_VALUE;

        for (int i = 1; i < array.length; i++) {
            maxOfA[i] = Math.max(maxOfA[i - 1], array[i]);
        }

        for (int i = 1; i < array.length; i++) {
            maxOfAMinusB[i] = Math.max(maxOfAMinusB[i - 1], maxOfA[i - 1] - array[i]);
        }

        for (int i = 2; i < array.length; i++) {
            maxOfAMinusBPlusC[i] = Math.max(maxOfAMinusBPlusC[i - 1], maxOfAMinusB[i - 1] + array[i]);
        }

        for (int i = 3; i < array.length; i++) {
            maxOfAMinusBPlusCMinusD[i] = Math.max(maxOfAMinusBPlusCMinusD[i - 1], maxOfAMinusBPlusC[i - 1] - array[i]);
        }

        return maxOfAMinusBPlusCMinusD[array.length - 1];
    }
}

