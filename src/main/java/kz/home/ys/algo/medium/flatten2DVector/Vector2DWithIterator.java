package kz.home.ys.algo.medium.flatten2DVector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Vector2DWithIterator {

    private final Iterator<Integer> iterator;

    public Vector2DWithIterator(int[][] vec) {
        List<Integer> list = new ArrayList<>();
        for (int[] ints : vec) {
            for (int num : ints) {
                list.add(num);
            }
        }
        iterator = list.iterator();
    }

    public int next() {
        return iterator.next();
    }

    public boolean hasNext() {
        return iterator.hasNext();
    }
}

/**
 * Your Vector2D object will be instantiated and called as such:
 * Vector2D obj = new Vector2D(vec);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */