package kz.home.ys.algo.medium.nextGreaterElementIII;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class NextGreaterElementIIIUsingPermutations {

    private final List<String> permutations = new ArrayList<>();

    public int nextGreaterElement(int n) {
        /*
        
        n = 123
        123 -> 132
        213 -> 231
        231 -> 213

        Time - O(n!)
        Space - O(n!)
        
        */
        
        String s = String.valueOf(n);
        permute(s.toCharArray(), 0, s.length() - 1);
        Collections.sort(permutations);
        int idx = permutations.size() - 1;
        while (idx >= 0) {
            if (permutations.get(idx).equals(s)) break;
            idx--;
        }
        return idx == permutations.size() - 1 ? -1 : Integer.parseInt(permutations.get(idx + 1));
    }

    private void permute(char[] arr, int l, int r) {
        if (l == r) permutations.add(new String(arr));
        else {
            for (int idx = l; idx <= r; idx++) {
                swap(arr, l, idx);
                permute(arr, l + 1, r);
                swap(arr, l, idx);
            }
        }
    }

    private void swap(char[] arr, int l, int r) {
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}