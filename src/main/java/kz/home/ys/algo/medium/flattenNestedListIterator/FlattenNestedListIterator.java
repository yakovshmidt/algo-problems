package kz.home.ys.algo.medium.flattenNestedListIterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FlattenNestedListIterator implements Iterator<Integer> {

    private List<Integer> flattenList;
    private int idx;

    // 1. initialize nestedList
    // 2. List<Integer> res
    // 3. global idx
    // time - O(N + L) - all elements of all nested lists
    // space - O(N + D) 
    public FlattenNestedListIterator(List<NestedInteger> nestedList) {
        flattenList = new ArrayList<>();

        flatElements(nestedList, flattenList);
    }

    private void flatElements(List<NestedInteger> nestedList, List<Integer> flattenList) {
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger()) {
                flattenList.add(nestedInteger.getInteger());
            } else {
                flatElements(nestedInteger.getList(), flattenList);
            }
        }
    }

    @Override
    public Integer next() {
        return flattenList.get(idx++);
    }

    @Override
    public boolean hasNext() {
        return idx < flattenList.size();
    }
}