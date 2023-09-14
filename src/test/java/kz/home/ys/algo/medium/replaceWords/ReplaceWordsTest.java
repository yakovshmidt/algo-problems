package kz.home.ys.algo.medium.replaceWords;

import junit.framework.TestCase;

import java.util.List;

public class ReplaceWordsTest extends TestCase {

    public void testReplaceWords() {
        String result = new ReplaceWords().replaceWords(List.of("cat", "bat", "rat"), "the cattle was rattled by the battery");

        assertEquals("the cat was rat by the bat", result);
    }
}