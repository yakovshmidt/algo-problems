package kz.home.ys.algo.easy.findAnagramMappings;

import junit.framework.TestCase;

public class FindAnagramMappingsTest extends TestCase {

    public void testAnagramMappings() {
        int[] expected = new int[]{1, 4, 3, 2, 0};

        int[] actual = new FindAnagramMappings().anagramMappings(new int[]{12, 28, 46, 32, 50}, new int[]{50, 12, 32, 46, 28});

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}