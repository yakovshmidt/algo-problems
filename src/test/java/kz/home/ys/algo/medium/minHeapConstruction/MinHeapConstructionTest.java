package kz.home.ys.algo.medium.minHeapConstruction;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MinHeapConstructionTest {

    @Test
    public void testMinHeapConstruction() {
        MinHeapConstruction.MinHeap minHeap =
                new MinHeapConstruction.MinHeap(
                        new ArrayList<>(
                                Arrays.asList(48, 12, 24, 7, 8, -5, 24, 391, 24, 56, 2, 6, 8, 41)));
        minHeap.insert(76);
        assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
        assertEquals(-5, minHeap.peek());
        assertEquals(-5, minHeap.remove());
        assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
        assertEquals(2, minHeap.peek());
        assertEquals(2, minHeap.remove());
        assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
        assertEquals(6, minHeap.peek());
        minHeap.insert(87);
        assertTrue(isMinHeapPropertySatisfied(minHeap.heap));
    }

    boolean isMinHeapPropertySatisfied(List<Integer> array) {
        for (int currentIdx = 1; currentIdx < array.size(); currentIdx++) {
            int parentIdx = (currentIdx - 1) / 2;
            if (array.get(parentIdx) > array.get(currentIdx)) {
                return false;
            }
        }
        return true;
    }
}