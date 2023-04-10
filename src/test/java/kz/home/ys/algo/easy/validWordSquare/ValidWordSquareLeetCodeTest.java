package kz.home.ys.algo.easy.validWordSquare;

import junit.framework.TestCase;

import java.util.List;

public class ValidWordSquareLeetCodeTest extends TestCase {

    public void testValidWordSquare() {
        boolean isValidWordSquare = new ValidWordSquareLeetCode().validWordSquare(List.of("ball", "area", "read", "lady"));

        assertFalse(isValidWordSquare);
    }
}