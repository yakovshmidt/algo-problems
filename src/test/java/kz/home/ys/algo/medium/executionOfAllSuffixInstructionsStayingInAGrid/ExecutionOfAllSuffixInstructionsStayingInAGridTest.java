package kz.home.ys.algo.medium.executionOfAllSuffixInstructionsStayingInAGrid;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;

public class ExecutionOfAllSuffixInstructionsStayingInAGridTest extends TestCase {

    public void testExecuteInstructions() {
        int[] expected = new int[]{1, 5, 4, 3, 1, 0};

        int[] actual = new ExecutionOfAllSuffixInstructionsStayingInAGrid().executeInstructions(3, new int[]{0, 1}, "RRDDLU");

        assertArrays(expected, actual);
    }
}