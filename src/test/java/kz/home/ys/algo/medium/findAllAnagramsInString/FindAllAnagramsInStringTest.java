package kz.home.ys.algo.medium.findAllAnagramsInString;

import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class FindAllAnagramsInStringTest {

    @Test
    public void testFindAnagrams() {
        List<Integer> anagramIndices = new FindAllAnagramsInString().findAnagrams("cbaebabacd", "abc");

        assertEquals(anagramIndices.size(), 2);
        assertEquals(anagramIndices.get(0).intValue(), 0);
        assertEquals(anagramIndices.get(1).intValue(), 6);
    }
}