package kz.home.ys.algo.medium.perfectSquares;

import java.util.ArrayList;
import java.util.List;

class PerfectSquares {

    public int numSquares(int n) {
        /*
        
        Approach:

        n = 12

        squares -> 1 4 9

        1) 1 -> n = 11 -> 1 -> n = 10 -> if 'n' < 0 -> stop the process
                          4 -> n = 7
                          9 -> n = 2
        result = 1


        2) 4 -> n = 8
        3) 9 -> n = 3

        time - O(M^N) - where M is number of perfect squares which are lower than 'n' and N is 'n'
        space - O(M^N) 

        */

        List<Integer> squares = new ArrayList<>();
        int curr = 1;
        while ((curr * curr) <= n) {
            squares.add(curr * curr);
            curr++;
        }

        return backtrack(squares, n, 0);
    }

    private int backtrack(List<Integer> squares, int n, int result) {
        if (n < 0) return Integer.MAX_VALUE;
        if (n == 0) return result;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < squares.size(); i++) {
            res = Math.min(res, backtrack(squares, n - squares.get(i), result + 1));
        }
        return res;
    }
}