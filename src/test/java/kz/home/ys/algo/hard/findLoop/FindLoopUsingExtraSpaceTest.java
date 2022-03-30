package kz.home.ys.algo.hard.findLoop;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class FindLoopUsingExtraSpaceTest {

    @Test
    public void testFindLoop() {
        TestLinkedListUsingExtraSpace test = new TestLinkedListUsingExtraSpace(0);
        test.addMany(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        test.getNthNode(10).next = test.getNthNode(5);
        FindLoopUsingExtraSpace.LinkedListUsingExtraSpace expected = test.getNthNode(5);

        FindLoopUsingExtraSpace.LinkedListUsingExtraSpace actual = new FindLoopUsingExtraSpace().findLoop(test);

        assertSame(expected, actual);
    }

    static class TestLinkedListUsingExtraSpace extends FindLoopUsingExtraSpace.LinkedListUsingExtraSpace {

        public TestLinkedListUsingExtraSpace(int value) {
            super(value);
        }

        public void addMany(int[] values) {
            FindLoopUsingExtraSpace.LinkedListUsingExtraSpace current = this;
            while (current.next != null) {
                current = current.next;
            }
            for (int value : values) {
                current.next = new FindLoopUsingExtraSpace.LinkedListUsingExtraSpace(value);
                current = current.next;
            }
        }

        public FindLoopUsingExtraSpace.LinkedListUsingExtraSpace getNthNode(int n) {
            int counter = 1;
            FindLoopUsingExtraSpace.LinkedListUsingExtraSpace current = this;
            while (counter < n) {
                current = current.next;
                counter++;
            }
            return current;
        }
    }
}