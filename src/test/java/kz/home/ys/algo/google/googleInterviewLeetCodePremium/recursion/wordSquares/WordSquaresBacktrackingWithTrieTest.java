package kz.home.ys.algo.google.googleInterviewLeetCodePremium.recursion.wordSquares;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class WordSquaresBacktrackingWithTrieTest {

    @Test
    public void testWordSquares() {
        List<List<String>> actual = new WordSquaresBacktrackingWithTrie().wordSquares(new String[]{"abat", "baba", "atan", "atal"});

        assertEquals(2, actual.size());
        assertEquals(4, actual.get(0).size());
        assertEquals(4, actual.get(1).size());
        assertEquals("baba", actual.get(0).get(0));
        assertEquals("abat", actual.get(0).get(1));
        assertEquals("baba", actual.get(0).get(2));
        assertEquals("atan", actual.get(0).get(3));
        assertEquals("baba", actual.get(1).get(0));
        assertEquals("abat", actual.get(1).get(1));
        assertEquals("baba", actual.get(1).get(2));
        assertEquals("atal", actual.get(1).get(3));
    }
}