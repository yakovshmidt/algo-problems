package kz.home.ys.algo.easy.findAnagramMappings;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class FindAnagramMappings {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        /*
        
        Input: nums1 = [12,28,46,32,50], nums2 = [50,12,32,46,28]
        result = [1,4,3,2,0]

        1. create map = [50,0],[12,1],[32,2],[46,3],[28,4] -> Map<Value, LinkedList<Index>>
        2. iterate over nums1 and find indices in nums2

        time - O(N)
        space - O(N)

        */
        int n = nums1.length;

        Map<Integer, LinkedList<Integer>> valuesToIndexes = new HashMap<>();
        for (int i = 0; i < n; i++) {
            valuesToIndexes.putIfAbsent(nums2[i], new LinkedList<>());
            valuesToIndexes.get(nums2[i]).add(i);
        }

        int[] result = new int[n];
        int idx = 0;
        for (int num1 : nums1) {
            LinkedList<Integer> indices = valuesToIndexes.get(num1);
            int num2Idx = indices.removeFirst();
            result[idx++] = num2Idx;
            if (indices.isEmpty()) valuesToIndexes.remove(num1);
        }
        return result;
    }
}