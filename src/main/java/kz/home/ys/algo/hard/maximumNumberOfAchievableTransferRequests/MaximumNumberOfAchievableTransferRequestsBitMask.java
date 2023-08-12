package kz.home.ys.algo.hard.maximumNumberOfAchievableTransferRequests;

class MaximumNumberOfAchievableTransferRequestsBitMask {

    // time - O(2^M * N)
    // space - O(N)
    public int maximumRequests(int n, int[][] requests) {
        int answer = 0;
        for (int mask = 0; mask < (1 << requests.length); mask++) {
            int[] inDegree = new int[n];
            int pos = requests.length - 1;
            int bitCount = Integer.bitCount(mask);

            if (bitCount <= answer) continue;

            for (int curr = mask; curr > 0; curr >>= 1, pos--) {
                if ((curr & 1) == 1) {
                    inDegree[requests[pos][0]]--;
                    inDegree[requests[pos][1]]++;
                }
            }

            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if (inDegree[i] != 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) answer = bitCount;
        }

        return answer;
    }
}