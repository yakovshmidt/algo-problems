package kz.home.ys.algo.hard.wordSearchII;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WordSearchIITest {

    @Test
    public void testFindWords() {
        List<String> actual = new WordSearchII().findWords(
                new char[][]{{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}},
                new String[]{"oath", "pea", "eat", "rain"}
        );
        actual.sort(String::compareTo);

        List<String> expected = new ArrayList<>();
        expected.add("eat");
        expected.add("oath");
        expected.sort(String::compareTo);

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }
}