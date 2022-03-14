package kz.home.ys.algo.medium.generateParenthesis;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class GenerateParenthesisClosureNumberTest   {

    @Test
    public void testGenerateParenthesis() {
        List<String> expected = new ArrayList<>() {{
            add("((()))");
            add("(()())");
            add("(())()");
            add("()(())");
            add("()()()");
        }};

        List<String> actual = new GenerateParenthesisClosureNumber().generateParenthesis(3);

        assertTrue(actual.containsAll(expected));
        assertTrue(expected.containsAll(actual));
    }
}