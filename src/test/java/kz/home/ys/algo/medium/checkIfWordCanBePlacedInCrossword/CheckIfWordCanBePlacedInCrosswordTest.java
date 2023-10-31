package kz.home.ys.algo.medium.checkIfWordCanBePlacedInCrossword;

import junit.framework.TestCase;

public class CheckIfWordCanBePlacedInCrosswordTest extends TestCase {

    public void testPlaceWordInCrossword() {
        boolean wordCanBePlacedInCrossword = new CheckIfWordCanBePlacedInCrossword().placeWordInCrossword(
                new char[][]{{' ', '#', 'a'}, {' ', '#', 'c'}, {' ', '#', 'a'}},
                "ac"
        );

        assertFalse(wordCanBePlacedInCrossword);
    }
}