package kz.home.ys.algo.easy.findTheDifferenceOfTwoArrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        /* 
        
        Constraints:
        * 1 <= length <= 1000
        * -1000 <= nums[i] <= 1000

        Approach:
        1. create sets from nums1 and nums2
        2. itrate over nums1 and checckk whether the value into the nums2 set or not
        3. repeat step 2 for nums1 array

        time - O(N + M)
        space - O(N + M)

        Approach 2:
        1. sort nums arrays
        2. iterate over nums1 and compare nums1[0] with nums2[0]
            if nums1[0] == nums2[0] -> move to the next element for both
            if nums1[0] < nums2[0] -> add nums1[0] to the resulted list
            if nums1[0] > nums2[0] -> move nums[0] to the next element
        3. repeat 2 step till we finish
        4. repeat 2 and 3 steps for nums2 array

        time - O(N*log(N) + M*log(M))
        space - O(1) 
        
        */

        Set<Integer> nums1AsSet = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            nums1AsSet.add(nums1[i]);
        }
        Set<Integer> nums2AsSet = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            nums2AsSet.add(nums2[i]);
        }

        List<List<Integer>> answer = List.of(
            new ArrayList<>(),
            new ArrayList<>()
        );

        for (int num1 : nums1AsSet) {
            if (!nums2AsSet.contains(num1)) answer.get(0).add(num1);
        } 
        for (int num2 : nums2AsSet) {
            if (!nums1AsSet.contains(num2)) answer.get(1).add(num2);
        } 
        
        return answer;
    }
}