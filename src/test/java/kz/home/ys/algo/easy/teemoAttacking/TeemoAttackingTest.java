package kz.home.ys.algo.easy.teemoAttacking;

import junit.framework.TestCase;

public class TeemoAttackingTest extends TestCase {

    public void testFindPoisonedDuration() {
        int poisonedDuration = new TeemoAttacking().findPoisonedDuration(new int[]{1, 4}, 2);

        assertEquals(4, poisonedDuration);
    }
}