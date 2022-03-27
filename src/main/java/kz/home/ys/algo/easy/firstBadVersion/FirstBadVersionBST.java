package kz.home.ys.algo.easy.firstBadVersion;

class VersionControl {

    public boolean isBadVersion(int version) {
        return version >= 4;
    }
}

public class FirstBadVersionBST extends VersionControl {

    // time - O(log(N))
    // space - O(1)
    public int firstBadVersion(int n) {
        return searchBadVersionViaBST(0, n);
    }
    
    private int searchBadVersionViaBST(int low, int high) {
        if (low > high) return low;
        
        int mid = low + ((high - low) / 2);
        boolean isBadVersion = isBadVersion(mid);
        if (isBadVersion) {
            return searchBadVersionViaBST(low, mid - 1);
        } else {
            return searchBadVersionViaBST(mid + 1, high);
        }
    }
}