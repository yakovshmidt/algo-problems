package kz.home.ys.algo.medium.wordBreak;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class WordBreakTest {

    @Test
    public void testWordBreak() {
        boolean wordCanBeBroken = new WordBreak().wordBreak("leetcode", List.of("neet", "leet", "code"));

        assertTrue(wordCanBeBroken);
    }
}