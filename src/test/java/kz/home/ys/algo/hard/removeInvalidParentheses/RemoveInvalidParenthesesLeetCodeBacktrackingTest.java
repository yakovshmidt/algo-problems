package kz.home.ys.algo.hard.removeInvalidParentheses;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class RemoveInvalidParenthesesLeetCodeBacktrackingTest {

    @Test
    public void testRemoveInvalidParentheses() {
        List<String> validParentheses = new RemoveInvalidParenthesesLeetCodeBacktracking().removeInvalidParentheses("(a)())()");

        assertEquals(2, validParentheses.size());
        assertEquals("(a)()()", validParentheses.get(0));
        assertEquals("(a())()", validParentheses.get(1));
    }
}