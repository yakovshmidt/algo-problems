package kz.home.ys.algo.medium.boatsToSavePeople;

import junit.framework.TestCase;
import org.junit.Test;

public class BoatsToSavePeopleTest extends TestCase {

    public void testNumRescueBoats() {
        int numberOfBoats = new BoatsToSavePeople().numRescueBoats(new int[]{1, 1, 1, 1}, 4);

        assertEquals(2, numberOfBoats);
    }
}