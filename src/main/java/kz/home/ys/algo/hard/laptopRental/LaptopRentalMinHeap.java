package kz.home.ys.algo.hard.laptopRental;

import java.util.ArrayList;
import java.util.Comparator;

class LaptopRentalMinHeap {

    // time - O(Nlog(N))
    // space - O(N)
    public int laptopRentals(ArrayList<ArrayList<Integer>> times) {
        if (times == null || times.isEmpty()) return 0;

        times.sort(Comparator.comparingInt(t -> t.get(0)));

        ArrayList<ArrayList<Integer>> timesWhenLaptopIsUsed = new ArrayList<>();
        timesWhenLaptopIsUsed.add(times.get(0));
        MinHeap heap = new MinHeap(timesWhenLaptopIsUsed);

        for (int i = 1; i < times.size(); i++) {
            ArrayList<Integer> currentInterval = times.get(i);
            if (heap.peek().get(1) <= currentInterval.get(0)) {
                heap.remove();
            }
            heap.insert(currentInterval);
        }

        return timesWhenLaptopIsUsed.size();
    }

    static class MinHeap {
        ArrayList<ArrayList<Integer>> heap;

        public MinHeap(ArrayList<ArrayList<Integer>> array) {
            heap = buildHeap(array);
        }

        public ArrayList<ArrayList<Integer>> buildHeap(ArrayList<ArrayList<Integer>> array) {
            int firstParentIdx = (array.size() - 2) / 2;
            for (int currentIdx = firstParentIdx; currentIdx >= 0; currentIdx--) {
                siftDown(currentIdx, array.size() - 1, array);
            }
            return array;
        }

        public void siftDown(int currentIdx, int endIdx, ArrayList<ArrayList<Integer>> heap) {
            int childOneIdx = 2 * currentIdx + 1;
            while (childOneIdx <= endIdx) {
                int childTwoIdx = (2 * currentIdx + 2 <= endIdx) ? 2 * currentIdx + 2 : -1;
                int idxToSwap;
                if (childTwoIdx != -1 && heap.get(childTwoIdx).get(1) < heap.get(childOneIdx).get(1)) {
                    idxToSwap = childTwoIdx;
                } else {
                    idxToSwap = childOneIdx;
                }
                if (heap.get(currentIdx).get(1) > heap.get(idxToSwap).get(1)) {
                    swap(currentIdx, idxToSwap, heap);
                    currentIdx = idxToSwap;
                    childOneIdx = 2 * currentIdx + 1;
                } else {
                    return;
                }
            }
        }

        public void siftUp(int currentIdx, ArrayList<ArrayList<Integer>> heap) {
            int parentIdx = (currentIdx - 1) / 2;
            while (currentIdx > 0 && heap.get(currentIdx).get(1) < heap.get(parentIdx).get(1)) {
                swap(currentIdx, parentIdx, heap);
                currentIdx = parentIdx;
                parentIdx = (currentIdx - 1) / 2;
            }
        }

        public ArrayList<Integer> peek() {
            return heap.get(0);
        }

        public ArrayList<Integer> remove() {
            swap(0, heap.size() - 1, heap);
            ArrayList<Integer> removed = heap.remove(heap.size() - 1);
            siftDown(0, heap.size() - 1, heap);
            return removed;
        }

        public void insert(ArrayList<Integer> value) {
            heap.add(value);
            siftUp(heap.size() - 1, heap);
        }

        public void swap(int i, int j, ArrayList<ArrayList<Integer>> heap) {
            ArrayList<Integer> temp = heap.get(i);
            heap.set(i, heap.get(j));
            heap.set(j, temp);
        }
    }
}

