package kz.home.ys.algo.hard.splitMessageBasedOnLimit;

import junit.framework.TestCase;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertArrays;

public class SplitMessageBasedOnLimitTest extends TestCase {

    public void testSplitMessage1() {
        String[] expected = new String[]{"thi<1/14>", "s i<2/14>", "s r<3/14>", "eal<4/14>", "ly <5/14>", "a v<6/14>", "ery<7/14>", " aw<8/14>", "eso<9/14>", "me<10/14>", " m<11/14>", "es<12/14>", "sa<13/14>", "ge<14/14>"};

        String[] actual = new SplitMessageBasedOnLimit().splitMessage("this is really a very awesome message", 9);

        assertArrays(expected, actual);
    }

    public void testSplitMessage2() {
        String[] expected = new String[]{};

        String[] actual = new SplitMessageBasedOnLimit().splitMessage("boxpn", 5);

        assertArrays(expected, actual);
    }

    public void testSplitMessage3() {
        String[] expected = new String[]{"abb<1/7>","aba<2/7>","bbb<3/7>","aaa<4/7>"," aa<5/7>","baa<6/7>"," a<7/7>"};

        String[] actual = new SplitMessageBasedOnLimit().splitMessage("abbababbbaaa aabaa a", 8);

        assertArrays(expected, actual);
    }
}