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
      // Write your code here.
    }

    public int peek() {
      return heap.get(0);
    }

    public int remove() {
      // Write your code here.
      return -1;
    }

    public void insert(int value) {
      // Write your code here.
    }
  }
}

