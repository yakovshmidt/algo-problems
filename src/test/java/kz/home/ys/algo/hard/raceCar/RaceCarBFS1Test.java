package kz.home.ys.algo.hard.raceCar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RaceCarBFS1Test {

    @Test
    public void testRaceCar() {
        RaceCarBFS1 raceCarBFS1 = new RaceCarBFS1();

        assertEquals(2, raceCarBFS1.raceCar(3));
        assertEquals(5, raceCarBFS1.raceCar(6));
    }
}