package kz.home.ys.algo.medium.insertDeleteRandomO1;

import java.util.*;

class InsertDeleteRandomO1 {

    private List<Integer> values;
    private Map<Integer, Integer> valuesToIndices;

    public InsertDeleteRandomO1() {
        values = new ArrayList<>();
        valuesToIndices = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if (valuesToIndices.containsKey(val)) return false;

        values.add(val);
        valuesToIndices.put(val, values.size() - 1);

        return true;
    }
    
    public boolean remove(int val) {
        if (!valuesToIndices.containsKey(val)) return false;

        int index = valuesToIndices.get(val);
        int lastIndex = values.size() - 1;
        int lastVal = values.get(lastIndex);
        valuesToIndices.put(lastVal, index);
        values.set(index, lastVal);
        values.remove(lastIndex);
        valuesToIndices.remove(val);

        return true;
    }
    
    public int getRandom() {
        int min = 0;
        int max = values.size() - 1;
        int randomIndex = new Random().nextInt((max - min) + 1) + min;
        return values.get(randomIndex);
    }
}