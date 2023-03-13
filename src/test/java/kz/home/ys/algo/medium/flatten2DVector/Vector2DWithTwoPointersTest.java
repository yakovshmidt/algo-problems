package kz.home.ys.algo.medium.flatten2DVector;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;


public class Vector2DWithTwoPointersTest {

    @Test
    public void testVector2D() {
        Vector2DWithTwoPointers vector2DWithIterator = new Vector2DWithTwoPointers(new int[][]{{1, 2}, {3}, {4}});

        assertEquals(1, vector2DWithIterator.next());
        assertEquals(2, vector2DWithIterator.next());
        assertEquals(3, vector2DWithIterator.next());
        assertTrue(vector2DWithIterator.hasNext());
        assertTrue(vector2DWithIterator.hasNext());
        assertEquals(4, vector2DWithIterator.next());
        assertFalse(vector2DWithIterator.hasNext());
    }
}