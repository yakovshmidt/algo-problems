package kz.home.ys.algo.medium.removeAllAdjacentDuplicatesInStringII;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RemoveAllAdjacentDuplicatesInStringIITest {

    @Test
    public void testRemoveDuplicates() {
        RemoveAllAdjacentDuplicatesInStringII removeAllAdjacentDuplicatesInStringII = new RemoveAllAdjacentDuplicatesInStringII();

        String result = removeAllAdjacentDuplicatesInStringII.removeDuplicates("deeedbbcccbdaa", 3);

        assertEquals("aa", result);
    }
}