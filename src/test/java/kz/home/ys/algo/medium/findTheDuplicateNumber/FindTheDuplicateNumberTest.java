package kz.home.ys.algo.medium.findTheDuplicateNumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheDuplicateNumberTest {

    @Test
    public void testFindDuplicate() {
        int duplicateNumber = new FindTheDuplicateNumber().findDuplicate(new int[]{1, 2, 3, 4, 2, 5});

        assertEquals(2, duplicateNumber);
    }
}