package kz.home.ys.algo.medium.bulbSwitcher;

class BulbSwitcher {

    // time - O(N^2)
    // space - O(N)
    public int bulbSwitch(int n) {
        boolean[] bulbs = new boolean[n];
        for (int step = 1; step <= n; step++) {
            for (int i = step - 1; i < n; i += step) {
                bulbs[i] = !bulbs[i];
            }
        }

        int count = 0;
        for (boolean bulb : bulbs) {
            if (bulb) count++;
        }

        return count;
    }
}