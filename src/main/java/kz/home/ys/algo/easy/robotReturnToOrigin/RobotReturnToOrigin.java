package kz.home.ys.algo.easy.robotReturnToOrigin;

class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int horizontal = 0;
        int vertical = 0;
        for (int i = 0; i < moves.length(); i++) {
            char letter = moves.charAt(i);
            if (letter == 'U') {
                vertical++;
            } else if (letter == 'D') {
                vertical--;
            } else if (letter == 'L') {
                horizontal--;
            } else {
                horizontal++;
            }
        } 
        return horizontal == 0 && vertical == 0;
    }
}