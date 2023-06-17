package kz.home.ys.algo.medium.findTheDuplicateInTheSystem;

import junit.framework.TestCase;

import java.util.List;

public class FindTheDuplicateInTheSystemTest extends TestCase {

    public void testFindDuplicate() {
        List<List<String>> duplicates = new FindTheDuplicateInTheSystem()
                .findDuplicate(new String[]{"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"});

        assertEquals(2, duplicates.size());
        assertEquals(3, duplicates.get(0).size());
        assertEquals(2, duplicates.get(1).size());
    }
}