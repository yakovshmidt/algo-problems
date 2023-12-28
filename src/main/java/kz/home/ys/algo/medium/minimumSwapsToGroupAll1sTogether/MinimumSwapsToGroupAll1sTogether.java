package kz.home.ys.algo.medium.minimumSwapsToGroupAll1sTogether;

public class MinimumSwapsToGroupAll1sTogether {

    public int minSwaps(int[] data) {
        int ones = 0;
        for (int num : data) {
            if (num == 1) ones++;
        }

        int zeros = 0;
        for (int i = 0; i < ones; i++) {
            if (data[i] == 0) zeros++;
        }

        int currZeros = zeros;
        for (int i = ones; i < data.length; i++) {
            int prev = data[i - ones];
            int curr = data[i];
            if (prev == 0) currZeros--;
            if (curr == 0) currZeros++;
            zeros = Math.min(zeros, currZeros);
        }

        return zeros;
    }
}
