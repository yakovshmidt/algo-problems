package kz.home.ys.algo.medium.groupShiftedStrings;

import junit.framework.TestCase;

import java.util.List;

public class GroupShiftedStringsTest extends TestCase {

    public void testGroupStrings() {
        List<List<String>> result = new GroupShiftedStrings().groupStrings(new String[]{"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"});

        assertEquals(4, result.size());
        assertEquals(2, result.get(0).size());
        assertEquals(3, result.get(1).size());
        assertEquals(2, result.get(2).size());
        assertEquals(1, result.get(3).size());
    }
}