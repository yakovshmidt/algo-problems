package kz.home.ys.algo.hard.stickersToSpellWord;

import junit.framework.TestCase;

public class StickersToSpellWordTest extends TestCase {

    public void testMinStickers() {
        int result = new StickersToSpellWord().minStickers(new String[]{"with", "example", "science"}, "thehat");

        assertEquals(3, result);
    }
}