package kz.home.ys.algo.easy.pascalsTriangle;

import junit.framework.TestCase;

import java.util.List;

public class PascalsTriangleTest extends TestCase {

    public void testGenerate() {
        List<List<Integer>> pascalsTriangle = new PascalsTriangle().generate(5);

        assertEquals(5, pascalsTriangle.size());
        assertEquals(1, pascalsTriangle.get(0).size());
        assertEquals(1, pascalsTriangle.get(0).get(0).intValue());
        assertEquals(2, pascalsTriangle.get(1).size());
        assertEquals(1, pascalsTriangle.get(1).get(0).intValue());
        assertEquals(1, pascalsTriangle.get(1).get(1).intValue());
        assertEquals(3, pascalsTriangle.get(2).size());
        assertEquals(1, pascalsTriangle.get(2).get(0).intValue());
        assertEquals(2, pascalsTriangle.get(2).get(1).intValue());
        assertEquals(1, pascalsTriangle.get(2).get(2).intValue());
        assertEquals(4, pascalsTriangle.get(3).size());
        assertEquals(1, pascalsTriangle.get(3).get(0).intValue());
        assertEquals(3, pascalsTriangle.get(3).get(1).intValue());
        assertEquals(3, pascalsTriangle.get(3).get(2).intValue());
        assertEquals(1, pascalsTriangle.get(3).get(3).intValue());
        assertEquals(5, pascalsTriangle.get(4).size());
        assertEquals(1, pascalsTriangle.get(4).get(0).intValue());
        assertEquals(4, pascalsTriangle.get(4).get(1).intValue());
        assertEquals(6, pascalsTriangle.get(4).get(2).intValue());
        assertEquals(4, pascalsTriangle.get(4).get(3).intValue());
        assertEquals(1, pascalsTriangle.get(4).get(4).intValue());
    }
}