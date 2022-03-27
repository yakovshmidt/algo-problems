package kz.home.ys.algo.easy.containsDuplicate;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ContainsDuplicateViaSortingTest {

    @Test
    public void testContainsDuplicate() {
        boolean actual = new ContainsDuplicateViaSorting().containsDuplicate(new int[]{1, 2, 3, 1});

        assertTrue(actual);
    }
}