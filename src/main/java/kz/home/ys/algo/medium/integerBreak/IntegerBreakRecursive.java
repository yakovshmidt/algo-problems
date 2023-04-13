package kz.home.ys.algo.medium.integerBreak;

class IntegerBreakRecursive {

    private int n = 0;
    int[] cache;

    public int integerBreak(int n) {
        this.n = n;
        this.cache = new int[n + 1];
        this.cache[1] = 1;
        
        return dfs(n);
    }

    private int dfs(int num) {
        if (this.cache[num] != 0) return this.cache[num];

        int res = num == n ? 0 : num;
        for (int i = 1; i < num; i++) {
            int val = dfs(i) * dfs(num - i);
            res = Math.max(res, val);
        }
        cache[num] = res;

        return res;
    }
}