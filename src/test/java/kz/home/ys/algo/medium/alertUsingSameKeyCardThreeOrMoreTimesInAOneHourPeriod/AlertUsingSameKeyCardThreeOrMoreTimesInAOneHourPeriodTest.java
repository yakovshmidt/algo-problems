package kz.home.ys.algo.medium.alertUsingSameKeyCardThreeOrMoreTimesInAOneHourPeriod;

import junit.framework.TestCase;

import java.util.List;

public class AlertUsingSameKeyCardThreeOrMoreTimesInAOneHourPeriodTest extends TestCase {

    public void testAlertNames() {
        List<String> result = new AlertUsingSameKeyCardThreeOrMoreTimesInAOneHourPeriod().alertNames(
                new String[]{"daniel", "daniel", "daniel", "luis", "luis", "luis", "luis"},
                new String[]{"10:00", "10:40", "11:00", "09:00", "11:00", "13:00", "15:00"}
        );

        assertEquals(1, result.size());
        assertEquals("daniel", result.get(0));
    }
}