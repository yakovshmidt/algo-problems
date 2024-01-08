package kz.home.ys.algo.medium.diameterOfNAryTree;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class DiameterOfNAryTreeUsingHeightTest extends TestCase {

    public void testDiameter() {
        int result = new DiameterOfNAryTreeUsingHeight().diameter(
                new Node(
                        1,
                        new ArrayList<>() {
                            {
                                add(new Node(
                                        3,
                                        new ArrayList<>() {{
                                            add(new Node(5));
                                            add(new Node(6));
                                        }}
                                ));
                                add(new Node(2));
                                add(new Node(4));
                            }
                        }
                )
        );

        assertEquals(3, result);
    }
}