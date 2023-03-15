package kz.home.ys.algo.medium.findTheCelebrity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheCelebrityTest {

    @Test
    public void testFindCelebrity() {
        int celebrity = new FindTheCelebrity().findCelebrity(3);

        assertEquals(1, celebrity);
    }
}