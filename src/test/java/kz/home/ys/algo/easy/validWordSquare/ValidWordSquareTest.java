package kz.home.ys.algo.easy.validWordSquare;

import junit.framework.TestCase;

import java.util.List;

public class ValidWordSquareTest extends TestCase {

    public void testValidWordSquare() {
        boolean isValidWordSquare = new ValidWordSquare().validWordSquare(List.of("abcd", "bnrt", "crmy", "dtye"));

        assertTrue(isValidWordSquare);
    }
}