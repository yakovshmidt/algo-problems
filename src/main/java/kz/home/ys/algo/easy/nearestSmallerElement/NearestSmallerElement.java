package kz.home.ys.algo.easy.nearestSmallerElement;

import java.util.ArrayList;
import java.util.Stack;
import java.util.TreeMap;

public class NearestSmallerElement {

    // time - O(N)
    // space - O(N)
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < A.size(); i++) {
            int num = A.get(i);
            if (i == 0) {
                result.add(-1);
            } else {
                while (!stack.isEmpty() && stack.peek() >= num) {
                    stack.pop();
                }
                result.add(stack.isEmpty() ? -1 : stack.peek());
            }
            stack.push(num);
        }

        return result;
    }
}
