package kz.home.ys.algo.medium.subdomainVisitCount;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class SubdomainVisitCountTest extends TestCase {

    public void testSubdomainVisits() {
        List<String> expected = new ArrayList<>();
        expected.add("9001 com");
        expected.add("9001 leetcode.com");
        expected.add("9001 discuss.leetcode.com");

        List<String> actual = new SubdomainVisitCount().subdomainVisits(new String[]{"9001 discuss.leetcode.com"});

        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }
}