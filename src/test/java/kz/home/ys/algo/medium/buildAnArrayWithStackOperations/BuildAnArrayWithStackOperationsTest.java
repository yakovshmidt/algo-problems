package kz.home.ys.algo.medium.buildAnArrayWithStackOperations;

import junit.framework.TestCase;

import java.util.List;

public class BuildAnArrayWithStackOperationsTest extends TestCase {

    public void testBuildArray() {
        List<String> expected = List.of("Push", "Push", "Pop", "Push");

        List<String> actual = new BuildAnArrayWithStackOperations().buildArray(new int[]{1, 3}, 3);

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }
}