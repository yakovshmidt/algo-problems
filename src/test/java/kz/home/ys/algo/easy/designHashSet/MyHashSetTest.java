package kz.home.ys.algo.easy.designHashSet;

import junit.framework.TestCase;

public class MyHashSetTest extends TestCase {

    public void testHashSet() {
        MyHashSet myHashSet = new MyHashSet();

        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        assertTrue(myHashSet.contains(1)); // return True
        assertFalse(myHashSet.contains(3)); // return False, (not found)
        myHashSet.add(2);      // set = [1, 2]
        assertTrue(myHashSet.contains(2)); // return True
        myHashSet.remove(2);   // set = [1]
        assertFalse(myHashSet.contains(2)); // return False, (already removed)
    }
}