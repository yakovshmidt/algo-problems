package kz.home.ys.algo.medium.singleThreadedCPU;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SingleThreadedCPU {

    public int[] getOrder(int[][] tasks) {
        if (tasks == null || tasks.length == 0) return new int[0];

        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> (o1[1] != o2[1]) ? (o1[1] - o2[1]) : (o1[2] - o2[2]));
        int[][] tasksWithIndices = new int[tasks.length][3];
        for (int i = 0; i < tasks.length; i++) {
            tasksWithIndices[i] = new int[] {tasks[i][0], tasks[i][1], i};
        }
        tasks = tasksWithIndices;
        Arrays.sort(tasks, Comparator.comparingInt(o -> o[0]));

        int[] result = new int[tasks.length];
        int resultIdx = 0;
        int taskIdx = 0;
        int currTime = 0;
        while (taskIdx < tasks.length || !queue.isEmpty()) {
            if (queue.isEmpty() && currTime < tasks[taskIdx][0]) {
                currTime = tasks[taskIdx][0];
            }

            while (taskIdx < tasks.length && currTime >= tasks[taskIdx][0]) {
                queue.offer(tasks[taskIdx]);
                taskIdx++;
            }

            int[] task = queue.poll();
            int processingTime = task[1];
            int index = task[2];

            currTime += processingTime;
            result[resultIdx++] = index;
        }

        return result;
    }
}
