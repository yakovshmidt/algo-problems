package kz.home.ys.algo.easy.validParentheses;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ValidParenthesesTest {

    @Test
    public void testIsValid() {
        boolean isValid = new ValidParentheses().isValid("((([])))[]{}");

        assertTrue(isValid);
    }
}