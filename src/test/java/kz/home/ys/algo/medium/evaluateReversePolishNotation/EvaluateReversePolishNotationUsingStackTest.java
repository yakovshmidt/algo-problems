package kz.home.ys.algo.medium.evaluateReversePolishNotation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvaluateReversePolishNotationUsingStackTest {

    @Test
    public void testEvalRPN() {
        int evalRPN = new EvaluateReversePolishNotationUsingStack().evalRPN(new String[]{"4", "13", "5", "/", "+"});

        assertEquals(6, evalRPN);
    }
}