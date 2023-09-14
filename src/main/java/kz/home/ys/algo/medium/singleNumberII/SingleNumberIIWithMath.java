package kz.home.ys.algo.medium.singleNumberII;

import java.util.HashSet;
import java.util.Set;

class SingleNumberIIWithMath {
    public int singleNumber(int[] nums) {
        /* 
        
        nums = (x1,x1,x1,x2,x2,x2,...,y1)
        nums = 3x1 + 3x2 + ... + y1
        nums = 3(x1 + x2 + ... +) + y1
        nums = 3(set - y1) + y1
        nums = 3set - 3y1 + y1
        nums = 3set - 2y1
        nums + 2y1 = 3set
        2y1 = 3set - nums
        y1 = (3set - nums) / 2

        set = (x1,x2,...,y1)
        set = x1 + x2 + ... + y1
        set - y1 = x1 + x2 + ...
        
        */

        Set<Long> uniqueNums = new HashSet<>();
        long numsSum = 0;
        for (int i = 0; i < nums.length; i++) {
            uniqueNums.add((long) nums[i]);
            numsSum += nums[i];
        }

        long uniqueNumsSum = 0;
        for (long num : uniqueNums) {
            uniqueNumsSum += num;
        }

        return (int) ((3 * uniqueNumsSum - numsSum) / 2);
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(6));
        // 110
        // 001
        // 010
        System.out.println(Integer.toBinaryString(-6));
    }
}