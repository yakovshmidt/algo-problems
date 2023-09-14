package kz.home.ys.algo.medium.grayCode;

import java.util.ArrayList;
import java.util.List;

class GrayCodeWithRecursion {

    private final List<Integer> result = new ArrayList<>();

    public List<Integer> grayCode(int n) {
        grayCodeHelper(n);
        return result;
    }

    private void grayCodeHelper(int n) {
        if (n == 0) {
            result.add(0);
            return;
        }

        grayCodeHelper(n - 1);
    
        int currentSequenceLength = result.size();
        int mask = 1 << (n - 1);
        for (int i = currentSequenceLength - 1; i >= 0; i--) {
            result.add(result.get(i) | mask);
        }
    }
}