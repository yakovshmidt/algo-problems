package kz.home.ys.algo.medium.videoStitching;

import junit.framework.TestCase;

public class VideoStitchingTest extends TestCase {

    public void testVideoStitching1() {
        int result = new VideoStitching().videoStitching(new int[][]{{0, 2}, {4, 6}, {8, 10}, {1, 9}, {1, 5}, {5, 9}}, 10);

        assertEquals(3, result);
    }

    public void testVideoStitching2() {
        int result = new VideoStitching().videoStitching(new int[][]{{0,1},{1,2}}, 5);

        assertEquals(-1, result);
    }
}