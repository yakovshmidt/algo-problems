package kz.home.ys.algo.medium.waterAndJugProblem;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class WaterAndJugProblem {

    public static class State {
        int x, y;

        public State(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public boolean canMeasureWater(int x, int y, int z) {
        if (x + y == z) return true;
        if (x + y < z) return false;
        if (x % 2 == 0 && y % 2 == 0 && z % 2 != 0) return false;

        Set<String> visited = new HashSet<>();
        State start = new State(0, 0);
        Queue<State> q = new LinkedList<>();
        q.add(start); 
        while (!q.isEmpty()) {
            int n = q.size();
            State curr = q.poll();
            if (curr.x + curr.y == z) return true;
            visited.add(curr.x + " " + curr.y);

            int newX, newY;
            // pour x -> y
            newX = curr.x - Math.min(curr.x, y - curr.y);
            newY = curr.y + Math.min(curr.x, y - curr.y);
            if (!visited.contains(newX + " " + newY)) q.offer(new State(newX, newY));
            // pour y -> x
            newX = curr.x - Math.min(curr.y, x - curr.x);
            newY = curr.y + Math.min(curr.y, x - curr.x);
            if (!visited.contains(newX + " " + newY)) q.offer(new State(newX, newY));
            // empty x
            newX = 0;
            newY = curr.y;
            if (!visited.contains(newX + " " + newY)) q.offer(new State(newX, newY));
            // empty y
            newX = curr.x;
            newY = 0;
            if (!visited.contains(newX + " " + newY)) q.offer(new State(newX, newY));
            // fill x
            newX = x;
            newY = curr.y;
            if (!visited.contains(newX + " " + newY)) q.offer(new State(newX, newY));
            // fill y
            newX = curr.x;
            newY = y;
            if (!visited.contains(newX + " " + newY)) q.offer(new State(newX, newY));
       }
       return false;
    }
}