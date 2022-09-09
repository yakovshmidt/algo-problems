package kz.home.ys.algo.easy.missingNumber;

class MissingNumberWithoutExtraSpace {

    // time - O(N)
    // space - O(1)
    public int missingNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int numsSum = 0;

        for (int curr : nums) {
            min = Math.min(min, curr);
            max = Math.max(max, curr);

            numsSum += curr;
        }
        
        if (min > 0) return 0;
        else if (max == nums.length - 1) return max + 1;
        else {
            int numsSumWithMissingNumber = 0;
            for (int i = min; i <= max; i++) {
                numsSumWithMissingNumber += i;
            }
            
            return numsSumWithMissingNumber - numsSum;
        }
    }
}