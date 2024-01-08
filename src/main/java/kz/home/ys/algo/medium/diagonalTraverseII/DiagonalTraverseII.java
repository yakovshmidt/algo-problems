package kz.home.ys.algo.medium.diagonalTraverseII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DiagonalTraverseII {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int size = 0;
        Map<Integer, List<Integer>> groups = new HashMap<>();
        for (int row = nums.size() - 1; row >= 0; row--) {
            for (int col = 0; col < nums.get(row).size(); col++) {
                groups.computeIfAbsent(row + col, o -> new ArrayList<>()).add(nums.get(row).get(col));
                size++;
            }
        }

        int[] result = new int[size];
        int idx = 0;
        int curr = 0;
        while (groups.containsKey(curr)) {
            for (int num : groups.get(curr)) {
                result[idx++] = num;
            }
            curr++;
        }

        return result;
    }
}