package kz.home.ys.algo.medium.carFleet;

import java.util.Arrays;
import java.util.Stack;

class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] positionToSpeed = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            positionToSpeed[i] = new int[] {position[i], speed[i]};
        }
        Arrays.sort(positionToSpeed, (o1, o2) -> o2[0] - o1[0]);

        Stack<Double> stack = new Stack<>();
        for (int[] pToS : positionToSpeed) {
            double dest = (double) (target - pToS[0]) / (double) pToS[1];
            if (stack.isEmpty() || stack.peek() < dest) {
                stack.push(dest);
            }
        }

        return stack.size();
    }
}