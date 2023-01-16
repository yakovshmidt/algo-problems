package kz.home.ys.algo.medium.invalidTransactions;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class InvalidTransactionsTest {

    @Test
    public void testInvalidTransactions() {
        List<String> invalidTransactions = new InvalidTransactions().invalidTransactions(
                new String[]{"alice,20,800,mtv", "alice,50,100,mtv", "alice,51,100,frankfurt"}
        );

        assertEquals(3, invalidTransactions.size());
    }
}