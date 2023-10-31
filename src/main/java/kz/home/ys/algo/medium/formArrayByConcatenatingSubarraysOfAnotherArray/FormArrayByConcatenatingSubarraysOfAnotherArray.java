package kz.home.ys.algo.medium.formArrayByConcatenatingSubarraysOfAnotherArray;

public class FormArrayByConcatenatingSubarraysOfAnotherArray {
    public boolean canChoose(int[][] groups, int[] nums) {
        /*

        Constraints:
        1 <= groups.length <= 10^3
        1 <= groups[i].length <= 10^3
        -10^7 <= groups[i][j] <= 10^7
        1 <= nums.length <= 10^3
        -10^7 <= nums[i] <= 10^7

        Approach:
        1. iterate over nums and try to find first group (0-indixed) ->
        2. as only we found the first group, we move on to the second one and repeat the action

        time - O(NUMS_LENGTH * MAX_GROUP_LENGTH)
        space - O(1)

        */

        //Input: groups = [[1,-1,-1],[3,-2,0]], nums = [1,-1,0,1,-1,-1,3,-2,0]
        int groupsIdx = 0;
        int[] group = groups[groupsIdx]; // [1,-1,-1]
        int numIdx = 0;
        while (numIdx < nums.length) {
            if (areSameSubArrays(group, nums, numIdx)) {
                numIdx += group.length;
                groupsIdx++;
                if (groupsIdx == groups.length) return true;
                group = groups[groupsIdx];
            } else {
                numIdx++;
            }
        }
        return false;
    }

    private boolean areSameSubArrays(int[] group, int[] nums, int numIdx) {
        int n = group.length;
        if (numIdx + n > nums.length) return false;

        for (int j : group) {
            if (j != nums[numIdx++]) {
                return false;
            }
        }

        return true;
    }
}
