package kz.home.ys.algo.medium.designAuthenticationManager;

import junit.framework.TestCase;

public class AuthenticationManagerTest extends TestCase {

    public void testAuthenticationManager() {
        AuthenticationManager authenticationManager = new AuthenticationManager(5);

        authenticationManager.renew("aaa", 1);
        authenticationManager.generate("aaa", 2);
        assertEquals(1, authenticationManager.countUnexpiredTokens(6));
        authenticationManager.generate("bbb", 7);
        authenticationManager.renew("aaa", 8);
        authenticationManager.renew("bbb", 10);
        assertEquals(0, authenticationManager.countUnexpiredTokens(15));
    }
}