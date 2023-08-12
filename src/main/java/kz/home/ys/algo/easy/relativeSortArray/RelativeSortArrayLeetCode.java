package kz.home.ys.algo.easy.relativeSortArray;

class RelativeSortArrayLeetCode {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] map = new int[1001];
        for (int num : arr1) {
            map[num]++;
        }

        int idx = 0;
        for (int num : arr2) {
            while (map[num]-- > 0) {
                arr1[idx++] = num;
            }
        }

        for (int i = 0; i < map.length; i++) {
            while (map[i]-- > 0) {
                arr1[idx++] = i;
            }
        }

        return arr1;
    }
}