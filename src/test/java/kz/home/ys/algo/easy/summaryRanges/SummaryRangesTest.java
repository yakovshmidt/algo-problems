package kz.home.ys.algo.easy.summaryRanges;

import junit.framework.TestCase;

import java.util.List;

public class SummaryRangesTest extends TestCase {

    public void testSummaryRanges() {
        List<String> ranges = new SummaryRanges().summaryRanges(new int[]{0, 1, 2, 4, 5, 7});

        assertEquals(3, ranges.size());
        assertEquals(ranges.get(0), "0->2");
        assertEquals(ranges.get(1), "4->5");
        assertEquals(ranges.get(2), "7");
    }
}