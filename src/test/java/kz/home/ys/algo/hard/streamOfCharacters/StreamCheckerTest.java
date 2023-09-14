package kz.home.ys.algo.hard.streamOfCharacters;

import junit.framework.TestCase;

public class StreamCheckerTest extends TestCase {

    public void testStreamChecker() {
        StreamChecker streamChecker = new StreamChecker(new String[]{"cd", "f", "kl"});

        assertFalse(streamChecker.query('a')); // return False
        assertFalse(streamChecker.query('b')); // return False
        assertFalse(streamChecker.query('c')); // return False
        assertTrue(streamChecker.query('d')); // return True, because 'cd' is in the wordlist
        assertFalse(streamChecker.query('e')); // return False
        assertTrue(streamChecker.query('f')); // return True, because 'f' is in the wordlist
        assertFalse(streamChecker.query('g')); // return False
        assertFalse(streamChecker.query('h')); // return False
        assertFalse(streamChecker.query('i')); // return False
        assertFalse(streamChecker.query('j')); // return False
        assertFalse(streamChecker.query('k')); // return False
        assertTrue(streamChecker.query('l')); // return True, because 'kl' is in the wordlist
    }

    public void testStreamChecker2() {
        StreamChecker streamChecker = new StreamChecker(new String[]{"ab", "ba", "aaab", "abab", "baa"});

        assertFalse(streamChecker.query('a'));
        assertFalse(streamChecker.query('a'));
        assertFalse(streamChecker.query('a'));
        assertFalse(streamChecker.query('a'));
        assertFalse(streamChecker.query('a'));
        assertTrue(streamChecker.query('b'));
        assertTrue(streamChecker.query('a'));
        assertTrue(streamChecker.query('b'));
        assertTrue(streamChecker.query('a'));
        assertTrue(streamChecker.query('b'));
    }
}