package kz.home.ys.algo.medium.permutationsII;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class PermutationsII {
    
    // time - O(N * N!)
    // space - O(N)
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> allPermutations = new ArrayList<>();
        permuteUnique(nums, allPermutations, 0);
        return allPermutations;
    }
    
    private void permuteUnique(int[] nums, List<List<Integer>> allPermutations, int pivot) {
        if (pivot == nums.length) {
            allPermutations.add(asList(nums));
            return;
        }
        
        Set<Integer> visited = new HashSet<>();
        for (int i = pivot; i < nums.length; i++) {
            int curr = nums[i];
            if (!visited.contains(curr)) {
                swap(nums, pivot, i);
                permuteUnique(nums, allPermutations, pivot + 1);
                swap(nums, i, pivot);
                visited.add(curr);
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    private List<Integer> asList(int[] array) {
        List<Integer> list = new ArrayList<>(array.length);
        for (int element : array) {
            list.add(element);
        }
        return list;
    } 
}