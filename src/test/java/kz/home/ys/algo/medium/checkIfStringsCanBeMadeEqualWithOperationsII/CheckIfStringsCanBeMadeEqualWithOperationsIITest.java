package kz.home.ys.algo.medium.checkIfStringsCanBeMadeEqualWithOperationsII;

import junit.framework.TestCase;

public class CheckIfStringsCanBeMadeEqualWithOperationsIITest extends TestCase {

    public void testCheckStrings() {
        boolean result = new CheckIfStringsCanBeMadeEqualWithOperationsII().checkStrings("wvmcbijonzvlufbmkqvz"
                ,"mzjvnqucbovlbzkivfwm");

        assertTrue(result);
    }
}