package kz.home.ys.algo.easy.maximumSubArray;

class MaximumSubArrayDivideAndConquer {

    private int[] nums;

    public int maxSubArray(int[] nums) {
        this.nums = nums;

        return findBestSurarray(0, nums.length - 1);
    }

    private int findBestSurarray(int left, int right) {
        if (left > right) return Integer.MIN_VALUE;

        int mid = left + (right - left) / 2;
        int curr = 0;
        int bestLeftSum = 0;
        int bestRightSum = 0;

        for (int i = mid - 1; i >= left; i--) {
            curr += nums[i];
            bestLeftSum = Math.max(bestLeftSum, curr);
        }

        curr = 0;
        for (int i = mid + 1; i <= right; i++) {
            curr += nums[i];
            bestRightSum = Math.max(bestRightSum, curr);
        }

        int bestCombinedSum = nums[mid] + bestLeftSum + bestRightSum;

        int leftHalf = findBestSurarray(left, mid - 1);
        int rightHalf = findBestSurarray(mid + 1, right);

        return Math.max(leftHalf, Math.max(rightHalf, bestCombinedSum));
    }
}