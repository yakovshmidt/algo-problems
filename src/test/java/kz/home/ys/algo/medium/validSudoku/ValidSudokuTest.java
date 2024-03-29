package kz.home.ys.algo.medium.validSudoku;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ValidSudokuTest {

    @Test
    public void testIsValidSudoku() {
        boolean isValidSudoku = new ValidSudoku().isValidSudoku(
                new char[][]{
                        {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}}
        );

        assertTrue(isValidSudoku);
    }
}