package kz.home.ys.algo.medium.rleIterator;

class RLEIterator {

    private final int[] encoding;
    private int idx;

    public RLEIterator(int[] encoding) {
        this.idx = 0;
        this.encoding = encoding;
    }
    
    public int next(int n) {
        while (n > 0) {
            if (idx >= encoding.length) return -1;
            if (encoding[idx] >= n) {
                encoding[idx] -= n;
                return encoding[idx + 1];
            } else {
                n = n - encoding[idx];
                idx += 2;
            }
        }

        return encoding[idx + 1];
    }
}

/**
 * Your RLEIterator object will be instantiated and called as such:
 * RLEIterator obj = new RLEIterator(encoding);
 * int param_1 = obj.next(n);
 */