package kz.home.ys.algo.medium.minimizedMaximumOfProductsDistributedToAnyStore;

import junit.framework.TestCase;

public class MinimizedMaximumOfProductsDistributedToAnyStoreTest extends TestCase {

    public void testMinimizedMaximum() {
        int minimizedMaximum = new MinimizedMaximumOfProductsDistributedToAnyStore().minimizedMaximum(6, new int[]{11, 6});

        assertEquals(3, minimizedMaximum);
    }
}