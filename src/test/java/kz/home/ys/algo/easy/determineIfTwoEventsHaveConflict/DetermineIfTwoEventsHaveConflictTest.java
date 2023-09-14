package kz.home.ys.algo.easy.determineIfTwoEventsHaveConflict;

import junit.framework.TestCase;

public class DetermineIfTwoEventsHaveConflictTest extends TestCase {

    public void testHaveConflict() {
        boolean haveConflict = new DetermineIfTwoEventsHaveConflict()
                .haveConflict(new String[]{"01:15", "02:00"}, new String[]{"02:00", "03:00"});

        assertTrue(haveConflict);
    }
}