package kz.home.ys.algo.hard.maximumStudentsTakingExam;

class MaximumStudentsTakingExam {

    private int maxCount = 0;
    private char[][] seats;

    public int maxStudents(char[][] seats) {
        this.seats = seats;

//        dp(0, 0, 0, new StringBuilder("########"));

        return maxCount;
    }

    /*private void dp(int count, int rowIdx, int startColIdx, StringBuilder bitmask) {
        int cols = seats[rowIdx].length;
        if (startColIdx >= cols) {
            startColIdx = 0;
            rowIdx++;
        }

        if (rowIdx == seats.length) {
            maxCount = Math.max(count, maxCount);
            return;
        }

        StringBuilder newBitmask = new StringBuilder();
        for (int colIdx = 0; colIdx < cols; colIdx++) {
            newBitmask.append(seats[rowIdx][colIdx]);
        }

        for (int colIdx = startColIdx; colIdx < cols; colIdx++) {
            if (seats[rowIdx][colIdx] == '#') continue;

            countWithout(count, colIdx, new StringBuilder(newBitmask));
            countWith(count, colIdx, new StringBuilder(newBitmask));

            newBitmask.setCharAt(colIdx, '#');
            dp(count, rowIdx, colIdx, new StringBuilder(newBitmask));
            newBitmask.setCharAt(colIdx, '.');

            if (canBeSat(bitmask, colIdx, cols)) {
                count++;

                int leftColIdx = -1;
                if (colIdx > 0) {
                    leftColIdx = colIdx - 1;
                    newBitmask.set(leftColIdx, "#");
                }
                int rightColIdx = -1;
                if (colIdx < cols - 1) {
                    rightColIdx = colIdx + 1;
                    newBitmask.set(rightColIdx, "#");
                }

                dp(count, rowIdx, colIdx + 1, new StringBuilder(newBitmask));
            }
        }
    }*/

    private void countWith() {

    }

    private boolean canBeSat(StringBuilder bitmask, int colIdx, int cols) {
        if (colIdx > 0) {
            char left = bitmask.charAt(colIdx - 1);
            if (left == '.') return false;
        }
        if (colIdx < cols - 1) {
            char right = bitmask.charAt(colIdx + 1);
            if (right == '.') return false;
        }
        return bitmask.charAt(colIdx) != '.';
    }
}