package kz.home.ys.algo.medium.insertDeleteRandomO1;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertDeleteRandomO1Test {

    @Test
    public void insertDeleteRandomO1() {
        InsertDeleteRandomO1 insertDeleteRandomO1 = new InsertDeleteRandomO1();

        assertTrue(insertDeleteRandomO1.insert(1));
        assertTrue(insertDeleteRandomO1.remove(1));
        assertFalse(insertDeleteRandomO1.remove(1));
        assertTrue(insertDeleteRandomO1.insert(2));
        assertEquals(2, insertDeleteRandomO1.getRandom());
    }
}