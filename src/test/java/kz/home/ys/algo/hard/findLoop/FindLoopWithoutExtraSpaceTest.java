package kz.home.ys.algo.hard.findLoop;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class FindLoopWithoutExtraSpaceTest {

    @Test
    public void testFindLoop() {
        TestLinkedListWithoutExtraSpace test = new TestLinkedListWithoutExtraSpace(0);
        test.addMany(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        test.getNthNode(10).next = test.getNthNode(5);
        FindLoopWithoutExtraSpace.LinkedListWithoutExtraSpace expected = test.getNthNode(5);

        FindLoopWithoutExtraSpace.LinkedListWithoutExtraSpace actual = new FindLoopWithoutExtraSpace().findLoop(test);

        assertSame(expected, actual);
    }

    static class TestLinkedListWithoutExtraSpace extends FindLoopWithoutExtraSpace.LinkedListWithoutExtraSpace {

        public TestLinkedListWithoutExtraSpace(int value) {
            super(value);
        }

        public void addMany(int[] values) {
            FindLoopWithoutExtraSpace.LinkedListWithoutExtraSpace current = this;
            while (current.next != null) {
                current = current.next;
            }
            for (int value : values) {
                current.next = new FindLoopWithoutExtraSpace.LinkedListWithoutExtraSpace(value);
                current = current.next;
            }
        }

        public FindLoopWithoutExtraSpace.LinkedListWithoutExtraSpace getNthNode(int n) {
            int counter = 1;
            FindLoopWithoutExtraSpace.LinkedListWithoutExtraSpace current = this;
            while (counter < n) {
                current = current.next;
                counter++;
            }
            return current;
        }
    }
}