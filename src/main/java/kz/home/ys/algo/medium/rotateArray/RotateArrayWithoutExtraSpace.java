package kz.home.ys.algo.medium.rotateArray;

class RotateArrayWithoutExtraSpace {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        fum(nums, 0, nums.length - 1);
        fum(nums, 0, k - 1);
        fum(nums, k, nums.length - 1);
    }

    private void fum(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}