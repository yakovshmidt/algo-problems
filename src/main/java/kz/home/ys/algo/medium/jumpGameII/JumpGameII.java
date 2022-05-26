package kz.home.ys.algo.medium.jumpGameII;

class JumpGameII {

    // time - O(N)
    // space - O(1)
    public int jump(int[] nums) {
        int res = 0;
        int l = 0;
        int r = 0;
        
        while (r < nums.length - 1) {
            int farthest = 0;
            for (int i = l; i <= r; i++) {  // 0 0, 1 3, 4,5
                farthest = Math.max(farthest, i + nums[i]);
            }
            l = r + 1;  // 1, 4,
            r = farthest; // 3, 5
            res++;
        }
        
        
        return res;
    }
}