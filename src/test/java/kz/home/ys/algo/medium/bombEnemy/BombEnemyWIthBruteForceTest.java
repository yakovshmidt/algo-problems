package kz.home.ys.algo.medium.bombEnemy;

import junit.framework.TestCase;

public class BombEnemyWIthBruteForceTest extends TestCase {

    public void testMaxKilledEnemies() {
        int result = new BombEnemyWIthBruteForce().maxKilledEnemies(new char[][]{{'0', 'E', '0', '0'}, {'E', '0', 'W', 'E'}, {'0', 'E', '0', '0'}});

        assertEquals(3, result);
    }
}