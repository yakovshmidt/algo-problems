package kz.home.ys.algo.medium.groupAnagrams;

import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class GroupAnagramsTest {

    @Test
    public void testGroupAnagrams() {
        List<List<String>> anagrams = new GroupAnagrams().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

        assertEquals(3, anagrams.size());
        assertTrue(anagrams.get(0).containsAll(List.of("eat", "tea", "ate")));
        assertTrue(anagrams.get(1).contains("bat"));
        assertTrue(anagrams.get(2).containsAll(List.of("tan", "nat")));
    }
}