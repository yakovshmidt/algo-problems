package kz.home.ys.algo.hard.maximumNumberOfAchievableTransferRequests;

class MaximumNumberOfAchievableTransferRequests {

    private int answer = 0;

    public int maximumRequests(int n, int[][] requests) {
        int[] inDegree = new int[n];

        maxRequest(requests, inDegree, n, 0, 0);

        return answer;
    }

    private void maxRequest(int[][] requests, int[] inDegree, int n, int index, int count) {
        if (index == requests.length) {
            for (int i = 0; i < n; i++) {
                if (inDegree[i] != 0) return;
            }

            answer = Math.max(answer, count);
            return;
        }

        inDegree[requests[index][0]]--;
        inDegree[requests[index][1]]++;
        
        maxRequest(requests, inDegree, n, index + 1, count + 1);
        
        inDegree[requests[index][0]]++;
        inDegree[requests[index][1]]--;

        maxRequest(requests, inDegree, n, index + 1, count);
    }
}