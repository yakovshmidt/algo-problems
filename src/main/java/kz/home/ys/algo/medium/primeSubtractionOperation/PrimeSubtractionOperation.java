package kz.home.ys.algo.medium.primeSubtractionOperation;

import java.util.Arrays;
import java.util.TreeSet;

class PrimeSubtractionOperation {

    // time - O(N^2) + O(N*log(M)) - where N is nums.length and M is primeNumbers.size()
    // space - O(M)
    public boolean primeSubOperation(int[] nums) {
        TreeSet<Integer> primeNumbers = new TreeSet<>();
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }    
            if (isPrime) primeNumbers.add(i);
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= nums[i + 1]) {
                Integer higher = primeNumbers.higher(nums[i] - nums[i + 1]);  // 5
                if (higher == null || higher >= nums[i]) return false;
                nums[i] -= higher;
            }
        }

        return true;
    }
}