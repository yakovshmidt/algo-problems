package kz.home.ys.algo.hard.minimumDifficultyOfAJobSchedule;

import junit.framework.TestCase;

public class MinimumDifficultyOfAJobScheduleTest extends TestCase {

    public void testMinDifficulty() {
        int minDifficulty = new MinimumDifficultyOfAJobSchedule().minDifficulty(new int[]{6, 5, 4, 3, 2, 1}, 2);

        assertEquals(7, minDifficulty);
    }
}