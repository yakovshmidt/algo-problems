package kz.home.ys.algo.easy.isomorphicStrings;

import junit.framework.TestCase;

public class IsomorphicStringsTest extends TestCase {

    public void testIsIsomorphic() {
        boolean isIsomorphic = new IsomorphicStrings().isIsomorphic("foo", "bar");

        assertFalse(isIsomorphic);
    }
}