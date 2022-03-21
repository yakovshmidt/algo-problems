package kz.home.ys.algo.hard.numbersInPi;

import java.util.*;

class NumbersInPi {

    // time - O(N^3 + M) - where N is length of PI and M is number of input numbers array
    // space - O(N + M)
    public int numbersInPi(String pi, String[] numbers) {
        Set<String> numbersAsSet = new HashSet<>();
        Collections.addAll(numbersAsSet, numbers);

        Map<Integer, Integer> idxToMinSpacesCache = new HashMap<>();
        int minSpaces = getMinSpaces(pi, numbersAsSet, idxToMinSpacesCache, 0);
        return minSpaces == Integer.MAX_VALUE ? -1 : minSpaces;
    }

    private int getMinSpaces(String pi,
                             Set<String> numbers,
                             Map<Integer, Integer> idxToMinSpacesCache,
                             int idx) {
        if (idx == pi.length()) return -1;
        if (idxToMinSpacesCache.containsKey(idx)) return idxToMinSpacesCache.get(idx);

        int minSpaces = Integer.MAX_VALUE;
        for (int i = idx; i < pi.length(); i++) {
            String prefix = pi.substring(idx, i + 1);
            if (numbers.contains(prefix)) {
                int minSpacesInSuffix = getMinSpaces(pi, numbers, idxToMinSpacesCache, i + 1);
                if (minSpacesInSuffix != Integer.MAX_VALUE) {
                    minSpaces = Math.min(minSpaces, minSpacesInSuffix + 1);
                }
            }
        }
        idxToMinSpacesCache.put(idx, minSpaces);
        return minSpaces;
    }
}

