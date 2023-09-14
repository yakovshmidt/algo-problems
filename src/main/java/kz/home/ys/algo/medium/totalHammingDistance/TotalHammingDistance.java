package kz.home.ys.algo.medium.totalHammingDistance;

class TotalHammingDistance {
    public int totalHammingDistance(int[] nums) {
        int[] count = new int[31];
        for (int num : nums) {
            for (int i = 0; i < 31; i++) {
                count[i] += (num >> i) & 1;
                System.out.println("count[" + i + "] = " + count[i]);
            }
            System.out.println("------");
        }

        int ans = 0;
        for (int k = 0; k < 31; k++) {
            ans += count[k] * (nums.length - count[k]);
        }
        return ans;
    }
}