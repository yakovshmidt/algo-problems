package kz.home.ys.algo.hard.maximizeExpression;

class MaximizeExpressionBruteForce {

    // time - O(N^4)
    // space - O(1)
    public int maximizeExpression(int[] array) {
        if (array == null || array.length < 4) return 0;

        int result = Integer.MIN_VALUE;
        for (int a = 0; a < array.length; a++) {
            for (int b = a + 1; b < array.length; b++) {
                for (int c = b + 1; c < array.length; c++) {
                    for (int d = c + 1; d < array.length; d++) {
                        result = Math.max(result, array[a] - array[b] + array[c] - array[d]);
                    }
                }
            }
        }

        return result;
    }
}

