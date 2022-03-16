package kz.home.ys.algo.medium.minHeapConstruction;

import java.util.*;

// Do not edit the class below except for the buildHeap,
// siftDown, siftUp, peek, remove, and insert methods.
// Feel free to add new properties and methods to the class.
public class MinHeapConstruction {
    static class MinHeap {
        List<Integer> heap;

        public MinHeap(List<Integer> array) {
            heap = buildHeap(array);
        }

        // time - O(N)
        // space - O(1)
        public List<Integer> buildHeap(List<Integer> array) {
            int firstParentIdx = (array.size() - 2) / 2;
            for (int currentIdx = firstParentIdx; currentIdx >= 0; currentIdx--) {
                siftDown(currentIdx, array.size() - 1, array);
            }
            return array;
        }

        // time - O(log(N)
        // space - O(1)
        public void siftDown(int currentIdx, int endIdx, List<Integer> heap) {
            int childIdxOne = 2 * currentIdx + 1;
            if (childIdxOne <= endIdx) {
                int childIdxTwo = 2 * currentIdx + 2 <= endIdx ? 2 * currentIdx + 2 : -1;
                int idxToSwap;
                if (childIdxTwo != -1 && heap.get(childIdxTwo) < heap.get(childIdxOne)) {
                    idxToSwap = childIdxTwo;
                } else {
                    idxToSwap = childIdxOne;
                }
                int child = heap.get(idxToSwap);
                int curr = heap.get(currentIdx);
                if (child < curr) {
                    heap.set(idxToSwap, curr);
                    heap.set(currentIdx, child);
                    siftDown(idxToSwap, heap.size() - 1, heap);
                }
            }
        }

        // time - O(log(N)
        // space - O(1)
        public void siftUp(int currentIdx, List<Integer> heap) {
            int curr = heap.get(currentIdx);
            int parentIdx = (currentIdx - 1) / 2;
            int parent = heap.get(parentIdx);
            if (curr < parent) {
                heap.set(parentIdx, curr);
                heap.set(currentIdx, parent);
                siftUp(parentIdx, heap);
            }
        }

        public int peek() {
            if (heap.isEmpty()) {
                return -1;
            } else {
                return heap.get(0);
            }
        }

        public int remove() {
            int lastIndex = heap.size() - 1;
            int oldRoot = heap.get(0);
            heap.set(0, heap.get(lastIndex));
            siftDown(0, lastIndex, heap);
            return oldRoot;
        }

        public void insert(int value) {
            heap.add(value);
            siftUp(heap.size() - 1, heap);
        }
    }
}

