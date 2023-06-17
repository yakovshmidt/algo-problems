package kz.home.ys.algo.easy.distributeCandies;

import java.util.HashSet;
import java.util.Set;

class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> eatenCandyTypes = new HashSet<>();
        int n = candyType.length / 2;
        for (int type : candyType) {
            if (!eatenCandyTypes.contains(type) && n > 0) {
                eatenCandyTypes.add(type);
                n--;
            }
            if (n == 0) break;
        }

        return eatenCandyTypes.size();
    }
}