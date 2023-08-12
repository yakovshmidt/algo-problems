package kz.home.ys.algo.medium.exclusiveTimeOfFunctions;

import java.util.List;
import java.util.Stack;

class ExclusiveTimeOfFunctions {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] tasks = new int[n];
        Stack<Integer> stack = new Stack<>();
        int prevTime = 0;
        for (String log : logs) {
            String[] currLog = log.split(":");
            int currTime = Integer.parseInt(currLog[2]);

            if (currLog[1].equals("start")) {
                if (!stack.isEmpty()) {
                    tasks[stack.peek()] += (currTime - prevTime);
                }
                stack.push(Integer.parseInt(currLog[0]));
                prevTime = currTime;
            } else {
                tasks[stack.pop()] += (currTime - prevTime + 1);
                prevTime = currTime + 1;
            }
        }

        return tasks;
    }
}