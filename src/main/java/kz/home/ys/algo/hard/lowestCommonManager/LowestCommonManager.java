package kz.home.ys.algo.hard.lowestCommonManager;

import java.util.*;

class LowestCommonManager {

    // time - O(N) - where N is number of reports
    // space - O(D) - where D is depth of the org chart (tree)
    public OrgChart getLowestCommonManager(OrgChart topManager,
                                           OrgChart reportOne,
                                           OrgChart reportTwo) {
        return getOrgInfo(topManager, reportOne, reportTwo).lowestCommonManager;
    }

    private OrgInfo getOrgInfo(OrgChart manager,
                               OrgChart reportOne,
                               OrgChart reportTwo) {
        int numImportantReports = 0;
        for (OrgChart report : manager.directReports) {
            OrgInfo orgInfo = getOrgInfo(report, reportOne, reportTwo);
            if (orgInfo.lowestCommonManager != null) return orgInfo;
            numImportantReports += orgInfo.numImportantReports;
        }
        if (manager == reportOne || manager == reportTwo) numImportantReports++;
        OrgChart lowestCommonManager = numImportantReports == 2 ? manager : null;
        return new OrgInfo(lowestCommonManager, numImportantReports);
    }

    static class OrgChart {
        public char name;
        public List<OrgChart> directReports;

        OrgChart(char name) {
            this.name = name;
            this.directReports = new ArrayList<>();
        }

        // This method is for testing only.
        public void addDirectReports(OrgChart[] directReports) {
            Collections.addAll(this.directReports, directReports);
        }
    }

    static class OrgInfo {
        public OrgChart lowestCommonManager;
        public int numImportantReports;

        public OrgInfo(OrgChart lowestCommonManager, int numImportantReports) {
            this.lowestCommonManager = lowestCommonManager;
            this.numImportantReports = numImportantReports;
        }
    }
}

