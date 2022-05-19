package kz.home.ys.algo.medium.allPathsFromSourceToTarget;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AllPathsFromSourceToTargetTest {

    @Test
    public void testAllPathsSourceTarget() {
        List<List<Integer>> actual = new AllPathsFromSourceToTarget().allPathsSourceTarget(
                new int[][]{{1, 2}, {3}, {3}, {}}
        );
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(0,1,3));
        expected.add(List.of(0,2,3));

        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            List<Integer> currExpected = expected.get(i);
            List<Integer> currActual = actual.get(i);
            for (int j = 0; j < currExpected.size(); j++) {
                assertEquals(currExpected.get(j), currActual.get(j));
            }
        }
    }
}