package kz.home.ys.algo.medium.canIWin;

import java.util.HashMap;
import java.util.Map;

class CanIWin {

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        int sum = maxChoosableInteger * (maxChoosableInteger + 1) / 2;
        if (sum < desiredTotal) return false;
        if (desiredTotal <= 0) return true;
        boolean[] used = new boolean[maxChoosableInteger + 1];
        Map<Integer, Boolean> memo = new HashMap<>();
        return canIWin(0, desiredTotal, used, memo);
    }

    private boolean canIWin(int sum, int desiredTotal, boolean[] used, Map<Integer, Boolean> memo) {
        if (sum >= desiredTotal) return false;
        int bit = bitMap(used);
        Boolean status = memo.get(bit);
        if (status != null) return status;
        for (int i = 1; i < used.length; i++) {
            if (!used[i]) {
                used[i] = true;
                status = !canIWin(sum + i, desiredTotal, used, memo);
                used[i] = false;
                if (status) break;
            }
        }
        memo.put(bit, status);
        return status;
    }

    private int bitMap(boolean[] used) {
        int bit = 0;
        for (boolean v : used) {
            bit <<= 1;
            if (v) bit |= 1;
        }
        return bit;
    }
}