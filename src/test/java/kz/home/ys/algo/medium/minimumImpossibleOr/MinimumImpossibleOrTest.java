package kz.home.ys.algo.medium.minimumImpossibleOr;

import junit.framework.TestCase;

public class MinimumImpossibleOrTest extends TestCase {

    public void testMinImpossibleOR() {
        int minImpossibleOR = new MinimumImpossibleOr().minImpossibleOR(new int[]{2, 1});

        assertEquals(4, minImpossibleOR);
    }
}