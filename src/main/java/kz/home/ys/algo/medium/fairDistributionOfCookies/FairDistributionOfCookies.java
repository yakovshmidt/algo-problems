package kz.home.ys.algo.medium.fairDistributionOfCookies;

class FairDistributionOfCookies {

    // time - O(K^N)
    // space - O(K + N)
    public int distributeCookies(int[] cookies, int k) {
        int[] bags = new int[k];

        return dp(bags, cookies, 0);
    }

    private int dp(int[] bags, int[] cookies, int idx) {
        if (idx == cookies.length) {
            int maxBag = Integer.MIN_VALUE;
            for (int bag : bags) {
                maxBag = Math.max(maxBag, bag);
            }

            return maxBag;
        }

        int minDistribution = Integer.MAX_VALUE;
        for (int i = 0; i < bags.length; i++) {
            int cookie = cookies[idx];
            bags[i] += cookie;
            int maxBag = dp(bags, cookies, idx + 1);
            minDistribution = Math.min(minDistribution, maxBag);
            bags[i] -= cookie;
        }

        return minDistribution;
    }
}