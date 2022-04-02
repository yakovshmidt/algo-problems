package kz.home.ys.algo.medium.minMaxStackConstruction;

import java.util.*;

class MinMaxStackConstruction {
    static class MinMaxStack {
        List<Map<String, Integer>> minMaxStack = new ArrayList<>();
        List<Integer> stack = new ArrayList<>();
        private static final String MIN = "min";
        private static final String MAX = "max";

        // time - O(1)
        // space - O(1)
        public int peek() {
            return stack.get(stack.size() - 1);
        }

        // time - O(1)
        // space - O(1)
        public int pop() {
            minMaxStack.remove(minMaxStack.size() - 1);
            return stack.remove(stack.size() - 1);
        }

        // time - O(1)
        // space - O(1)
        public void push(Integer number) {
            Map<String, Integer> newMinMax = new HashMap<>();
            newMinMax.put(MIN, number);
            newMinMax.put(MAX, number);
            if (!minMaxStack.isEmpty()) {
                Map<String, Integer> lastMinMax = new HashMap<>(minMaxStack.get(minMaxStack.size() - 1));
                newMinMax.replace(MIN, Math.min(lastMinMax.get(MIN), number));
                newMinMax.replace(MAX, Math.max(lastMinMax.get(MAX), number));
            }
            minMaxStack.add(newMinMax);
            stack.add(number);
        }


        // time - O(1)
        // space - O(1)
        public int getMin() {
            return minMaxStack.get(minMaxStack.size() - 1).get(MIN);
        }

        // time - O(1)
        // space - O(1)
        public int getMax() {
            return minMaxStack.get(minMaxStack.size() - 1).get(MAX);
        }
    }
}

