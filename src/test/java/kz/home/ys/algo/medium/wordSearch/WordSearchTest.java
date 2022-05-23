package kz.home.ys.algo.medium.wordSearch;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class WordSearchTest {

    @Test
    public void testExist() {
        boolean exist = new WordSearch()
                .exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED");

        assertTrue(exist);
    }
}