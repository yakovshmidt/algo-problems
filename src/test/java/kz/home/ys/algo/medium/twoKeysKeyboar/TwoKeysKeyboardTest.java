package kz.home.ys.algo.medium.twoKeysKeyboar;

import junit.framework.TestCase;

public class TwoKeysKeyboardTest extends TestCase {

    public void testMinSteps() {
        int result = new TwoKeysKeyboard().minSteps(3);

        assertEquals(3, result);
    }
}