package kz.home.ys.algo.medium.validateStackSequences;

import junit.framework.TestCase;

public class ValidateStackSequencesTest extends TestCase {

    public void testValidateStackSequences() {
        boolean isValidStackSequence = new ValidateStackSequences().validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1});

        assertTrue(isValidStackSequence);
    }
}