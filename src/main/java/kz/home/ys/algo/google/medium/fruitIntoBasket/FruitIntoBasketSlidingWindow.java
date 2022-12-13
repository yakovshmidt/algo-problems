package kz.home.ys.algo.google.medium.fruitIntoBasket;

import java.util.HashMap;
import java.util.Map;

class FruitIntoBasketSlidingWindow {

    // time - O(N)
    // space - O(N)
    public int totalFruit(int[] fruits) {
        if (fruits.length == 1) return 1;

        Map<Integer, Integer> fruitsToCounts = new HashMap<>();
        fruitsToCounts.put(fruits[0], 1);

        int leftIdx = 0;
        int rightIdx = 1;

        while (rightIdx < fruits.length) {
            fruitsToCounts.put(fruits[rightIdx], fruitsToCounts.getOrDefault(fruits[rightIdx], 0) + 1);

            if (fruitsToCounts.size() > 2) {
                fruitsToCounts.put(fruits[leftIdx], fruitsToCounts.getOrDefault(fruits[leftIdx], 0) - 1);
                if (fruitsToCounts.get(fruits[leftIdx]) == 0) {
                    fruitsToCounts.remove(fruits[leftIdx]);
                }
                leftIdx++;
            }

            rightIdx++;
        }

        return rightIdx - leftIdx;
    }
}