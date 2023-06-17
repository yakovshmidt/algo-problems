package kz.home.ys.algo.easy.validPalindrome;

import junit.framework.TestCase;

public class ValidPalindromeWithoutExtraSpaceTest extends TestCase {

    public void testIsPalindrome() {
        ValidPalindromeWithoutExtraSpace validPalindromeWithoutExtraSpace = new ValidPalindromeWithoutExtraSpace();

        assertTrue(validPalindromeWithoutExtraSpace.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(validPalindromeWithoutExtraSpace.isPalindrome("race a car"));
        assertTrue(validPalindromeWithoutExtraSpace.isPalindrome(" "));
    }
}