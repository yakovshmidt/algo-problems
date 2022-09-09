package kz.home.ys.algo.easy.missingNumber;

class MissingNumberBitManipulation {

    // time - O(N)
    // space - O(1)
    public int missingNumber(int[] nums) {
        int xor = 0;
        
        for (int num : nums) {
            xor ^= num;
        }
        
        for (int i = 1; i <= nums.length; i++) {
            xor ^= i;
        }
        
        return xor;
    }
}