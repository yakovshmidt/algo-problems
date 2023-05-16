package kz.home.ys.algo.medium.makeKSubarraySumsEqual;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MakeKSubarraySumsEqual {

    // time - O(N*log(N))
    // space - O(N)
    public long makeSubKSumEqual(int[] arr, int k) {
        long res = 0;
        int n = arr.length;

        boolean[] visited = new boolean[n];
        for (int i = 0; i < k; i++) {
            if (visited[i]) continue;
            int index = i;
            List<Integer> temp = new ArrayList<>();
            while (!visited[index]) {
                visited[index] = true;
                temp.add(arr[index]);
                index = (index + k) % n;
            }
            Collections.sort(temp);
            int mid = temp.get((temp.size() - 1) / 2);
            for (int num : temp) {
                res += Math.abs(num - mid);
            }
        }
        return res;
    }
}

















