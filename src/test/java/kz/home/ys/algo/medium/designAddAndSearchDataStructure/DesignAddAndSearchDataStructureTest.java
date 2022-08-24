package kz.home.ys.algo.medium.designAddAndSearchDataStructure;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DesignAddAndSearchDataStructureTest {

    @Test
    public void addAndSearchWordTest() {
        DesignAddAndSearchDataStructure designAddAndSearchDataStructure = new DesignAddAndSearchDataStructure();
        designAddAndSearchDataStructure.addWord("a");
        designAddAndSearchDataStructure.addWord("a");
        assertTrue(designAddAndSearchDataStructure.search("."));
        assertTrue(designAddAndSearchDataStructure.search("a"));
        assertFalse(designAddAndSearchDataStructure.search("aa"));
        assertTrue(designAddAndSearchDataStructure.search("a"));
        assertFalse(designAddAndSearchDataStructure.search(".a"));
        assertFalse(designAddAndSearchDataStructure.search("a."));
    }
}