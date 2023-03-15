package kz.home.ys.algo.medium.findTheCelebrity;/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindTheCelebrity extends Relation {

    // time = O(N^2)
    // space = O(N^2)
    public int findCelebrity(int n) {
        Map<Integer, Set<Integer>> knows = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                boolean iKnowsJ = knows(i, j);
                if (iKnowsJ) {
                    Set<Integer> relations = knows.getOrDefault(i, new HashSet<>());
                    relations.add(j);
                    knows.put(i, relations);
                }
                 boolean jKnowsI = knows(j, i);
               if (jKnowsI) {
                    Set<Integer> relations = knows.getOrDefault(j, new HashSet<>());
                    relations.add(i);
                    knows.put(j, relations);
                }
           }
        }

        Map<Integer, Integer> personToCount = new HashMap<>();
        for (int i = 0; i < n; i++) {
            personToCount.put(i, 0);
        }

        for (Map.Entry<Integer, Set<Integer>> entry : knows.entrySet()) {
            int person = entry.getKey();
            Set<Integer> listOfPeopleThatPersonKnows = entry.getValue();
            for (int knownPerson : listOfPeopleThatPersonKnows) {
                personToCount.put(knownPerson, personToCount.get(knownPerson) + 1);
                personToCount.put(person, personToCount.get(person) - 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : personToCount.entrySet()) {
            if (entry.getValue() == n - 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
}