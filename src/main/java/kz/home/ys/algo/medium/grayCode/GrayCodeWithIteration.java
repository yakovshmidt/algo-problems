package kz.home.ys.algo.medium.grayCode;

import java.util.ArrayList;
import java.util.List;

class GrayCodeWithIteration {

    private final List<Integer> result = new ArrayList<>();

    public List<Integer> grayCode(int n) {
        result.add(0);

        for (int i = 1; i <= n; i++) {
            int previousSequenceLength = result.size();
            int mask = 1 << (i - 1);
            for (int j = previousSequenceLength - 1; j >= 0; j--) {
                result.add(mask + result.get(j));
            }
        }

        return result;
    }
}