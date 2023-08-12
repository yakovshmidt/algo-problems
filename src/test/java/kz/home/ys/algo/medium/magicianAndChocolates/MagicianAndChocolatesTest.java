package kz.home.ys.algo.medium.magicianAndChocolates;

import junit.framework.TestCase;

import java.util.List;

public class MagicianAndChocolatesTest extends TestCase {

    public void testNchoc() {
        int result = new MagicianAndChocolates().nchoc(10, List.of(2147483647, 2000000014, 2147483647));

        assertEquals(284628164, result);
    }
}