package kz.home.ys.algo.medium.maxChunksToMakeSorted;

class MaxChunksToMakeSorted {
    public int maxChunksToSorted(int[] arr) {
        /* 

        [4,3,2,1,0] -> 
         4>3 -> go on
         3>2 -> go on
         2>1 -> go on
         1>0 -> go on
        
        [4,3,2,1,0]
        [4,3],[2,1,0] -> [3,4][0,1,2]

        [1,0,2,3,4] -> [1,0][2,3,4] ->
         1>0 -> go on
         0<2 -> increment ans
         2<3 -> inc ans
         3<4 -> inc ans

        [0,3,2,1,4] -> [0,3][2,1][4] 

        [3,0,1,2,4] 
        4>0 - go on
        0<1 - inc

        1. iterate over th arr
        2. compare curr with next element 
            if curr < next -> increment number of chunks
            if curr > next -> goo oon to the next one w/ incremention

        time - O(N)
        space - O(1) 

        1,2,0,3

        */

        int ans = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);

            if (max == i) ans++;
        }

        return ans;
    }
}