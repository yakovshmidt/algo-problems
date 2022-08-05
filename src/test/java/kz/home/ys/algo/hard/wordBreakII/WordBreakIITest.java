package kz.home.ys.algo.hard.wordBreakII;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class WordBreakIITest {

    @Test
    public void testWordBreak() {
        List<String> result = new WordBreakII().wordBreak("catsanddog", List.of("cat", "cats", "and", "sand", "dog"));

        assertEquals(2, result.size());
        assertEquals("cats and dog", result.get(0));
        assertEquals("cat sand dog", result.get(1));
    }
}