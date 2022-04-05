package kz.home.ys.algo.hard.lowestCommonManager;

import org.junit.Test;

import java.util.HashMap;

import static junit.framework.TestCase.assertSame;

public class LowestCommonManagerTest {

    @Test
    public void testGetLowestCommonManager() {
        var orgCharts = getOrgCharts();
        orgCharts
                .get('A')
                .addDirectReports(new LowestCommonManager.OrgChart[]{orgCharts.get('B'), orgCharts.get('C')});
        orgCharts
                .get('B')
                .addDirectReports(new LowestCommonManager.OrgChart[]{orgCharts.get('D'), orgCharts.get('E')});
        orgCharts
                .get('C')
                .addDirectReports(new LowestCommonManager.OrgChart[]{orgCharts.get('F'), orgCharts.get('G')});
        orgCharts
                .get('D')
                .addDirectReports(new LowestCommonManager.OrgChart[]{orgCharts.get('H'), orgCharts.get('I')});

        LowestCommonManager.OrgChart lcm =
                new LowestCommonManager().getLowestCommonManager(orgCharts.get('A'), orgCharts.get('E'), orgCharts.get('I'));

        assertSame(lcm, orgCharts.get('B'));
    }

    private HashMap<Character, LowestCommonManager.OrgChart> getOrgCharts() {
        var orgCharts = new HashMap<Character, LowestCommonManager.OrgChart>();
        var alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (char a : alphabet.toCharArray()) {
            orgCharts.put(a, new LowestCommonManager.OrgChart(a));
        }
        orgCharts.get('X').addDirectReports(new LowestCommonManager.OrgChart[]{orgCharts.get('Z')});
        return orgCharts;
    }
}