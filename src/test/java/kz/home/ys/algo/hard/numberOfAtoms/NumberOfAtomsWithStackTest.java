package kz.home.ys.algo.hard.numberOfAtoms;

import junit.framework.TestCase;

public class NumberOfAtomsWithStackTest extends TestCase {

    public void testCountOfAtoms() {
        NumberOfAtomsWithStack numberOfAtoms = new NumberOfAtomsWithStack();

        assertEquals("K4N2O14S4", numberOfAtoms.countOfAtoms("K4(ON(SO3)2)2"));
        assertEquals("B7H11He49Li20N47O35", numberOfAtoms.countOfAtoms("H11He49NO35B7N46Li20"));
        assertEquals("H2O", numberOfAtoms.countOfAtoms("H2O"));
        assertEquals("H2MgO2", numberOfAtoms.countOfAtoms("Mg(OH)2"));
    }
}