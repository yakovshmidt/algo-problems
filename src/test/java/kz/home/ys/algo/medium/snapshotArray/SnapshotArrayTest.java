package kz.home.ys.algo.medium.snapshotArray;

import junit.framework.TestCase;

public class SnapshotArrayTest extends TestCase {

    public void testSnapshotArray() {
        SnapshotArray snapshotArray = new SnapshotArray(3);

        snapshotArray.set(0, 5);
        assertEquals(0, snapshotArray.snap());
        snapshotArray.set(0,6);
        assertEquals(5, snapshotArray.get(0, 0));
    }
}