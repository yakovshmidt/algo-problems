package kz.home.ys.algo.medium.cloneGraph;

import org.junit.Test;

import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CloneGraphIterativeTest {

    @Test
    public void testCloneGraph() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);

        one.neighbors.add(two);
        one.neighbors.add(four);
        two.neighbors.add(one);
        two.neighbors.add(three);
        three.neighbors.add(four);
        three.neighbors.add(two);
        four.neighbors.add(one);
        four.neighbors.add(three);

        Node oneCopy = new CloneGraphIterative().cloneGraph(one);

        assertEquals(1, oneCopy.val);
        assertEquals(2, oneCopy.neighbors.size());
        assertTrue(oneCopy.neighbors.stream().map(it -> it.val).collect(Collectors.toList()).contains(two.val));
        assertTrue(oneCopy.neighbors.stream().map(it -> it.val).collect(Collectors.toList()).contains(four.val));
    }
}