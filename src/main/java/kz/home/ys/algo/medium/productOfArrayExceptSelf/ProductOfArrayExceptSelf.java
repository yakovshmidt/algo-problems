package kz.home.ys.algo.medium.productOfArrayExceptSelf;

class ProductOfArrayExceptSelf {
    
    // time - O(N)
    // space - O(1)
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        boolean hasOneZero = false;
        boolean hasMoreThanOneZero = false;
        int totalProduct = 1;
        
        for (int num : nums) {
            if (num == 0) {
                if (hasOneZero) {
                    hasMoreThanOneZero = true;
                    break;
                } else {
                    hasOneZero = true;
                }
            } else {
                totalProduct *= num;
            }
        }
        
        if (hasMoreThanOneZero) return answer;
        
        for (int i = 0; i < nums.length; i++) {
            if (hasOneZero) {
                if (nums[i] == 0) {
                    answer[i] = totalProduct;
                }
            } else {
                answer[i] = totalProduct / nums[i];
            }
        }
        
        return answer;
    }
}