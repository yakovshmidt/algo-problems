package kz.home.ys.algo.medium.letterCombinationOfPhoneNumber;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LetterCombinationOfPhoneNumberTest {

    @Test
    public void testLetterCombinations() {
        List<String> expected = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");

        List<String> actual = new LetterCombinationOfPhoneNumber().letterCombinations("23");

        assertEquals(expected.size(), actual.size());
        assertTrue(actual.containsAll(expected));
    }
}