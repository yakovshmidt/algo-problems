package kz.home.ys.algo.medium.findOriginalArrayFromDoubledArray;

class FindOriginalArrayFromDoubledArrayUsingCountingSort {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 != 0) return new int[0];
        
        int max = 0;
        for (int num : changed) max = Math.max(max, num);

        int[] count = new int[2 * max + 1];
        for (int num : changed) count[num]++;

        int idx = 0;
        int[] original = new int[n / 2];
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                count[i]--;
     
                int twoTimesI = i * 2;
                if (count[twoTimesI] > 0) {
                    count[twoTimesI]--;
                    original[idx++] = i;
                } else {
                    return new int[0];
                }
            }
        }

        if (idx == original.length) return original;
        return new int[0];
    }
}