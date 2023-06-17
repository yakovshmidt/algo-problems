package kz.home.ys.algo.easy.constructTheRectangle;

import junit.framework.TestCase;

public class ConstructTheRectangleTest extends TestCase {

    public void testConstructRectangle() {
        int[] rectangle = new ConstructTheRectangle().constructRectangle(122122);

        assertEquals(427, rectangle[0]);
        assertEquals(286, rectangle[1]);
    }

    public static void main(String[] args) {
        System.out.println(22 / 10);
        System.out.println(2 / 10);
    }
}