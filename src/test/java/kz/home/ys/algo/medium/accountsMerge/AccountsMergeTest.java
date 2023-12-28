package kz.home.ys.algo.medium.accountsMerge;

import junit.framework.TestCase;

import java.util.List;

import static kz.home.ys.algo.helper.ArrayTestingHelper.assertMatrices;

public class AccountsMergeTest extends TestCase {

    public void testAccountsMerge() {
        List<List<String>> expected = List.of(
                List.of("John","john00@mail.com","john_newyork@mail.com","johnsmith@mail.com"),
                List.of("Mary","mary@mail.com"),
                List.of("John","johnnybravo@mail.com")
        );

        List<List<String>> actual = new AccountsMerge().accountsMerge(
                List.of(
                        List.of("John", "johnsmith@mail.com", "john_newyork@mail.com"),
                        List.of("John", "johnsmith@mail.com", "john00@mail.com"),
                        List.of("Mary", "mary@mail.com"),
                        List.of("John", "johnnybravo@mail.com")
                )
        );

        assertMatrices(expected, actual);
    }
}