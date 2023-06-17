package kz.home.ys.algo.easy.pascalsTriangle;

import java.util.ArrayList;
import java.util.List;

class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows >= 1) result.add(List.of(1));
        if (numRows >= 2) result.add(List.of(1,1));
        for (int i = 2; i < numRows; i++) {
            List<Integer> above = result.get(i - 1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            int j = i - 1;
            while (j > 0) {
                curr.add(above.get(j - 1) + above.get(j));
                j--;
            }
            curr.add(1);
            result.add(curr);
        }
        return result;
    }
}