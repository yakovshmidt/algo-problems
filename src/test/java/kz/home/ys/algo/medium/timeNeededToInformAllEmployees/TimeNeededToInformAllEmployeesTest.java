package kz.home.ys.algo.medium.timeNeededToInformAllEmployees;

import junit.framework.TestCase;

public class TimeNeededToInformAllEmployeesTest extends TestCase {

    public void testNumOfMinutes() {
        int numOfMinutes = new TimeNeededToInformAllEmployees().numOfMinutes(6, 2, new int[]{2, 2, -1, 2, 2, 2}, new int[]{0, 0, 1, 0, 0});

        assertEquals(1, numOfMinutes);
    }
}