package kz.home.ys.algo.medium.minimizedMaximumOfProductsDistributedToAnyStore;

public class MinimizedMaximumOfProductsDistributedToAnyStore {

    private int n;
    private int[] quantities;

    public int minimizedMaximum(int n, int[] quantities) {
        this.n = n;
        this.quantities = quantities;

        int l = 1;
        int r = 0;
        for (int quantity : quantities) {
            r += quantity;
        }
        while (l < r) {
            int m = l + (r - l) / 2;
            if (isValid(m)) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        return l;
    }

    private boolean isValid(int maxNumberProduct) {
        int count = 0;
        for (int quantity : quantities) {
            count += (maxNumberProduct + quantity - 1) / maxNumberProduct;
            if (count > n) return false;
        }
        return true;
    }
}
