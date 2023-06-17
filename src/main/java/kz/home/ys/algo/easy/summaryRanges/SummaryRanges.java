package kz.home.ys.algo.easy.summaryRanges;

import java.util.ArrayList;
import java.util.List;

class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int l = 0;
        int r = 0;
        while (l < nums.length) {
            while (r < nums.length - 1 && nums[r] == nums[r + 1] - 1) { //
                r++; // 1, 2,
            }
            if (l == r) {
                result.add(String.valueOf(nums[l]));
            } else {
                result.add(nums[l] + "->" + nums[r]);
            }
            r++;
            l = r;
        }
        return result;
    }
}