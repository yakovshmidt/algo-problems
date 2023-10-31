package kz.home.ys.algo.medium.validateIPAddress;

import junit.framework.TestCase;

public class ValidateIPAddressTest extends TestCase {

    public void testValidIPAddress() {
        ValidateIPAddress validateIPAddress = new ValidateIPAddress();

        assertEquals("IPv4", validateIPAddress.validIPAddress("172.16.254.1"));
        assertEquals("IPv6", validateIPAddress.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
        assertEquals("Neither", validateIPAddress.validIPAddress("256.256.256.256"));
    }
}