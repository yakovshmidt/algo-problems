package kz.home.ys.algo.medium.minHeapConstruction;

import java.util.*;

// Do not edit the class below except for the buildHeap,
// siftDown, siftUp, peek, remove, and insert methods.
// Feel free to add new properties and methods to the class.
class MinHeapConstruction {
    static class MinHeap {
        List<Integer> heap;

        public MinHeap(List<Integer> array) {
            heap = buildHeap(array);
        }

        public List<Integer> buildHeap(List<Integer> array) {
            // Write your code here.
            return new ArrayList<>();
        }

        public void siftDown(int currentIdx, int endIdx, List<Integer> heap) {
            // Write your code here.
        }

        public void siftUp(int currentIdx, List<Integer> heap) {
            int current = heap.get(currentIdx);
            int parentIdx = (currentIdx - 1) / 2;
            int parent = heap.get(parentIdx);
            if (current < parent) {
                swap(currentIdx, parentIdx, heap);
                siftUp(parentIdx, heap);
            }
        }

        public int peek() {
            return heap.get(0);
        }

        public int remove() {
            // Write your code here.
            return -1;
        }

        public void insert(int value) {
            heap.add(value);
            siftUp(heap.size() - 1, heap);
        }

        private void swap(int i, int j, List<Integer> heap) {
            int temp = heap.get(i);
            heap.set(i, heap.get(j));
            heap.set(j, temp);
        }
    }
}

