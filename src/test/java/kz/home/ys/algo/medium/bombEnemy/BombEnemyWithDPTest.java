package kz.home.ys.algo.medium.bombEnemy;

import junit.framework.TestCase;

public class BombEnemyWithDPTest extends TestCase {

    public void testMaxKilledEnemies() {
        int result = new BombEnemyWithDP().maxKilledEnemies(new char[][]{{'0', 'E', '0', '0'}, {'E', '0', 'W', 'E'}, {'0', 'E', '0', '0'}});

        assertEquals(3, result);
    }
}