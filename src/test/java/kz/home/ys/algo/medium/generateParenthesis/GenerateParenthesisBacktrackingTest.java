package kz.home.ys.algo.medium.generateParenthesis;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class GenerateParenthesisBacktrackingTest {

    @Test
    public void testGenerateParenthesis() {
        List<String> expected = new ArrayList<>() {{
            add("((()))");
            add("(()())");
            add("(())()");
            add("()(())");
            add("()()()");
        }};

        List<String> actual = new GenerateParenthesisBacktracking().generateParenthesis(3);

        assertTrue(actual.containsAll(expected));
        assertTrue(expected.containsAll(actual));
    }
}