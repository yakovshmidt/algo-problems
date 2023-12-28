package kz.home.ys.algo.medium.rotatingTheBox;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertMatrices;

public class RotatingTheBoxTest extends TestCase {

    public void testRotateTheBox1() {
        char[][] expected = new char[][]{{'.'}, {'#'}, {'#'}};
        char[][] actual = new RotatingTheBox().rotateTheBox(new char[][]{{'#', '.', '#'}});

        assertMatrices(expected, actual);
    }

    public void testRotateTheBox2() {
        char[][] expected = new char[][]{{'#','.'},{'#','#'},{'*','*'},{'.','.'}};
        char[][] actual = new RotatingTheBox().rotateTheBox(new char[][]{{'#','.','*','.'},{'#','#','*','.'}});

        assertMatrices(expected, actual);
    }
}