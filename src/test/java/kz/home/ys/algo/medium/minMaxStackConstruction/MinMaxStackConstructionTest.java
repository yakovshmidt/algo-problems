package kz.home.ys.algo.medium.minMaxStackConstruction;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MinMaxStackConstructionTest  {

    @Test
    public void testMinMaxStackConstruction() {
        MinMaxStackConstruction.MinMaxStack stack = new MinMaxStackConstruction.MinMaxStack();
        stack.push(5);
        testMinMaxPeek(5, 5, 5, stack);
        stack.push(7);
        testMinMaxPeek(5, 7, 7, stack);
        stack.push(2);
        testMinMaxPeek(2, 7, 2, stack);
        assertEquals(2, stack.pop());
        assertEquals(7, stack.pop());
        testMinMaxPeek(5, 5, 5, stack);
    }

    public void testMinMaxPeek(int min, int max, int peek, MinMaxStackConstruction.MinMaxStack stack) {
        assertEquals(stack.getMin(), min);
        assertEquals(stack.getMax(), max);
        assertEquals(stack.peek(), peek);
    }
}