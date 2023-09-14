package kz.home.ys.algo.medium.circularArrayLoop;

import java.util.HashSet;
import java.util.Set;

class CircularArrayLoop {

    public boolean circularArrayLoop(int[] nums) {
        Set<Integer> visited = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (visited.contains(i)) continue;

            Set<Integer> currSequence = new HashSet<>();

            int index = i, prev = i - 1;
            while (nums[i] * nums[index] > 0) {
                if (index == prev) break;
                else prev = index;

                if (currSequence.contains(index)) return true;
                currSequence.add(index);

                index += nums[index];
                index = index % nums.length;
                if (index < 0) index += nums.length;
            }

            visited.addAll(currSequence);
            if (visited.size() == nums.length) break;
        }

        return false;
    }
}