package kz.home.ys.algo.easy.validPalindrome;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ValidPalindromeTest   {

    @Test
    public void testIsPalindrome() {
        boolean isPalindrome = new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama");

        assertTrue(isPalindrome);
    }
}