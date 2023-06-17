package kz.home.ys.algo.easy.checkIfItIsStraightLine;

class CheckIfItIsStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        int deltaX = coordinates[1][0] - coordinates[0][0];
        int deltaY = coordinates[1][1] - coordinates[0][1];
        for (int i = 2; i < coordinates.length; i++) {
            int currDeltaX = coordinates[i][0] - coordinates[0][0];
            int currDeltaY = coordinates[i][1] - coordinates[0][1];

            if (deltaX * currDeltaY != deltaY * currDeltaX) return false;
        }
        return true;
    }
}