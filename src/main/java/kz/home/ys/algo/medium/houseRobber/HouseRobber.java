package kz.home.ys.algo.medium.houseRobber;

class HouseRobber {

    // time - O(N)
    // space - O(1)
    public int rob(int[] nums) {
        int rob1 = 0;
        int rob2 = 0;

        for (int n : nums) {
            int temp = Math.max(rob1 + n, rob2);
            rob1 = rob2;
            rob2 = temp;
        }

        return rob2;
    }
}