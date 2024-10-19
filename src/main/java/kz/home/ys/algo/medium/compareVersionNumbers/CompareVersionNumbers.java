package kz.home.ys.algo.medium.compareVersionNumbers;

class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        /*
        
        Approach:

        1.2
        1.10

        1.2 or 1.10

        Input: version1 = "1.0", version2 = "1.0.1.0" -> result is 1

        Constrains:
        1. 1 <= v1.length, v2.length <= 500
        2. v1 and v2 consist of digits and dots only
        3.

        Approach:
        1. split by .
        2. iterate over revisions, parse them to ints and compare
            if one of the revisions is null, set it as zero
        
        
        */

        String[] splitVersion1 = version1.split("\\.");
        String[] splitVersion2 = version2.split("\\.");
        int v1Idx = 0;
        int v2Idx = 0;
        while (v1Idx < splitVersion1.length || v2Idx < splitVersion2.length) {
            int v1Revision = 0;
            if (v1Idx < splitVersion1.length) v1Revision = Integer.parseInt(splitVersion1[v1Idx++]);
            int v2Revision = 0;
            if (v2Idx < splitVersion2.length) v2Revision = Integer.parseInt(splitVersion2[v2Idx++]);
            System.out.println(v1Revision);
            System.out.println(v2Revision);

            if (v1Revision < v2Revision) {
                return -1;
            } else if (v1Revision > v2Revision) {
                return 1;
            }
        }

        return 0;
    }
}