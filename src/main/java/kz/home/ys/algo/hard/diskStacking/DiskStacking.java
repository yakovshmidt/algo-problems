package kz.home.ys.algo.hard.diskStacking;

import java.util.*;

class DiskStacking {

    // time - O(N^2)
    // space - O(N)
    public List<Integer[]> diskStacking(List<Integer[]> disks) {
        if (disks == null || disks.isEmpty()) return new ArrayList<>();

        disks.sort(Comparator.comparing(disk -> disk[2]));

        int[] heights = createDefaultHeights(disks);
        int[] sequences = createDefaultSequences(disks);

        int maxHeightIdx = 0;
        for (int i = 1; i < disks.size(); i++) {
            Integer[] currDisk = disks.get(i);
            for (int j = 0; j < i; j++) {
                Integer[] comparisonDisk = disks.get(j);
                if (areValidDemensions(currDisk, comparisonDisk)) {
                    if (heights[i] <= heights[j] + currDisk[2]) {
                        heights[i] = heights[j] + currDisk[2];
                        sequences[i] = j;
                    }
                }
            }
            if (heights[i] >= heights[maxHeightIdx]) {
                maxHeightIdx = i;
            }
        }

        return buildSequence(disks, sequences, maxHeightIdx);
    }

    private int[] createDefaultSequences(List<Integer[]> disks) {
        int[] sequences = new int[disks.size()];
        for (int i = 0; i < disks.size(); i++) {
            sequences[i] = Integer.MIN_VALUE;
        }
        return sequences;
    }

    private int[] createDefaultHeights(List<Integer[]> disks) {
        int[] heights = new int[disks.size()];
        for (int i = 0; i < disks.size(); i++) {
            heights[i] = disks.get(i)[2];
        }
        return heights;
    }

    private boolean areValidDemensions(Integer[] currDisk, Integer[] comparisonDisk) {
        return currDisk[0] > comparisonDisk[0]
                && currDisk[1] > comparisonDisk[1]
                && currDisk[2] > comparisonDisk[2];
    }

    private List<Integer[]> buildSequence(List<Integer[]> disks, int[] sequences, int currIdx) {
        List<Integer[]> sequence = new ArrayList<>();
        while (currIdx != Integer.MIN_VALUE) {
            sequence.add(0, disks.get(currIdx));
            currIdx = sequences[currIdx];
        }
        return sequence;
    }
}

