package kz.home.ys.algo.medium.findPeakElement;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FindPeakElementTest {

    @Test
    public void testFindPeakElement() {
        int peakIdx = new FindPeakElement().findPeakElement(new int[]{1, 2, 3, 1});

        assertEquals(2, peakIdx);
    }
}