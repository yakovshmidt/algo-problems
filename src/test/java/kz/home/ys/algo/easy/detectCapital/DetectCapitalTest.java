package kz.home.ys.algo.easy.detectCapital;

import junit.framework.TestCase;

public class DetectCapitalTest extends TestCase {

    public void testDetectCapitalUse() {
        boolean isDetected = new DetectCapital().detectCapitalUse("FlaG");

        assertFalse(isDetected);
    }
}