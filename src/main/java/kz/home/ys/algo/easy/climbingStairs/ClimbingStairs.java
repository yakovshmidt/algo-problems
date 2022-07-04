package kz.home.ys.algo.easy.climbingStairs;

class ClimbingStairs {

    // time - O(N)
    // space - O(1)
    public int climbStairs(int n) {
        int f = 0;
        int s = 1;
        for (int i = 0; i < n; i++) {
            int temp = s;
            s = f + s;
            f = temp;
        }
        
        return s;
    }
}