package kz.home.ys.algo.medium.minimumSuffixFlips;

import junit.framework.TestCase;

public class MinimumSuffixFlipsTest extends TestCase {

    public void testMinFlips() {
        int result = new MinimumSuffixFlips().minFlips("10111");

        assertEquals(3, result);
    }

    public static void main(String[] args) {
        System.out.println(2 % 4);
        System.out.println(4 % 2);
    }
}