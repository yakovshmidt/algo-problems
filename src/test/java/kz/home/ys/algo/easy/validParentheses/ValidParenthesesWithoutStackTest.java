package kz.home.ys.algo.easy.validParentheses;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ValidParenthesesWithoutStackTest   {

    @Test
    public void testIsValid() {
        boolean isValid = new ValidParenthesesWithoutStack().isValid("((([])))[]{}");

        assertTrue(isValid);
    }
}