package kz.home.ys.algo.medium.rotateArray;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RotateArrayUsingExtraSpaceTest {

    @Test
    public void testRotate() {
        int[] actual = new int[] {1,2,3,4,5,6,7};
        int[] expected = new int[] {5,6,7,1,2,3,4};

        new RotateArrayUsingExtraSpace().rotate(actual, 3);

        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}