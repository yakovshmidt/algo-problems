package kz.home.ys.algo.medium.simplifyPath;

import junit.framework.TestCase;

public class SimplifyPathTest extends TestCase {

    public void testSimplifyPath() {
        String simplifiedPath = new SimplifyPath().simplifyPath("/home/../bar/.//foo/");

        assertEquals("/bar/foo", simplifiedPath);
    }
}