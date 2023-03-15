package kz.home.ys.algo.medium.findTheCelebrity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Relation {

    public boolean knows(int a, int b) {
        Map<Integer, Set<Integer>> knows = new HashMap<>();
        knows.put(0, new HashSet<>() {{
            add(1);
        }});
        knows.put(1, new HashSet<>());
        knows.put(2, new HashSet<>() {{
            add(0);
            add(1);
        }});
        return knows.get(a).contains(b);
    }
}
