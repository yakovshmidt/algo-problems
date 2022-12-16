package kz.home.ys.algo.google.googleInterviewLeetCodePremium.treesAndGraphs.evaluateDivision;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class EvaluateDivisionTest {

    @Test
    public void testCalcEquation() {
        double[] expected = new double[]{6.0, 0.5, -1.0, 1.0, -1.0};
        double[] actual = new EvaluateDivision().calcEquation(
                List.of(List.of("a", "b"), List.of("b", "c")),
                new double[]{2.0, 3.0},
                List.of(List.of("a", "c"), List.of("b", "a"), List.of("a", "e"), List.of("a", "a"), List.of("x", "x"))
        );

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i], 0);
        }
    }
}