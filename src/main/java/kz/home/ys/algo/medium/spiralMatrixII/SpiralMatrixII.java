package kz.home.ys.algo.medium.spiralMatrixII;

class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        /* 
        
        Constraints:
        1 <= n <= 20

        Approach:
        1. create variables rowStart = 0, rowEnd = n, colStart = 0, and colEnd = n
        2. while rowStart < rowEnd and colStart < colEnd
        3. each iteration we decrement start and end indices until they are not equal to one another 
        
        Example:
        n = 3
        rowStart = 0, rowEnd = 3, colStart = 0, colEnd = 3]

        while start <= end

            go right
            go down
            go left
            go up

            decrement end indices
            increment start indices

        time - O(N^2)
        space - O(N^2)

        */

        int value = 1;
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;

        int[][] answer = new int[n][n];

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) { // [0..2]
                answer[rowStart][i] = value++;
            }
            for (int i = rowStart + 1; i <= rowEnd; i++) { // [1..2]
                answer[i][colEnd] = value++;
            }
            for (int i = colEnd - 1; i >= colStart; i--) { // [1..0]
                answer[rowEnd][i] = value++;
            }
            for (int i = rowEnd - 1; i > rowStart; i--) { // [1..1]
                answer[i][colStart] = value++;
            }

            rowStart++;
            colStart++;
            rowEnd--;
            colEnd--;
        }

        return answer;
    }
}



















