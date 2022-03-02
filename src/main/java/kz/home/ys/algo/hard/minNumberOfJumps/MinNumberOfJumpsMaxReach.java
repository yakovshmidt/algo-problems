package kz.home.ys.algo.hard.minNumberOfJumps;

class MinNumberOfJumpsMaxReach {

    // time - O(N)
    // space - O(1)
    public int minNumberOfJumps(int[] array) {
        if (array == null || array.length <= 1) return 0;

        int maxReach = array[0];
        int steps = array[0];
        int jumps = 0;

        for (int i = 1; i < array.length - 1; i++) {
            maxReach = Math.max(maxReach, array[i] + i);
            steps--;
            if (steps == 0) {
                jumps++;
                steps = maxReach - i;
            }
        }

        return jumps + 1;
    }
}