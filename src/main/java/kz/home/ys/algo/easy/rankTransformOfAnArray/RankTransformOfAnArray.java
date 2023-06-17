package kz.home.ys.algo.easy.rankTransformOfAnArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        /*
        
        Approach:
        1) create a copy of arr
        2) sort the copy of arr
        3) create a map<Value, Rank>
        4) create a resulted map
        
        */

        int[] sortedArr = new int[arr.length];
        System.arraycopy(arr, 0, sortedArr, 0, arr.length);
        Arrays.sort(sortedArr);

        Map<Integer, Integer> valuesToRanks = new HashMap<>();
        int rank = 1;
        for (int i = 0; i < sortedArr.length; i++) {
            if (i != 0 && sortedArr[i - 1] == sortedArr[i]) continue;

            valuesToRanks.put(sortedArr[i], rank++);
        }

        int[] resultedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            resultedArr[i] = valuesToRanks.get(num);
        }

        return resultedArr;
    }
}