package kz.home.ys.algo.google.easy.uniqueEmailAddresses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueEmailAddressesTest {

    @Test
    public void testNumUniqueEmails() {
        int numUniqueEmails1 = new UniqueEmailAddresses()
                .numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"});

        assertEquals(2, numUniqueEmails1);

        int numUniqueEmails2 = new UniqueEmailAddresses()
                .numUniqueEmails(new String[]{"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"});

        assertEquals(3, numUniqueEmails2);
    }
}