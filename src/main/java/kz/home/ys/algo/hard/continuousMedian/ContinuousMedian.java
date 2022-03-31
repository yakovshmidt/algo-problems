package kz.home.ys.algo.hard.continuousMedian;

import java.util.*;

// Do not edit the class below except for
// the insert method. Feel free to add new
// properties and methods to the class.
class ContinuousMedian {

    // time - O(N*log(N)) - where N is length numbers
    // space - O(N)
    static class ContinuousMedianHandler {
        double median = 0;
        private final Set<Integer> numbers = new TreeSet<>(Integer::compareTo);

        public void insert(int number) {
            numbers.add(number);

            int mid = (numbers.size() - 1) / 2;
            int iterator = 0;
            if (numbers.size() % 2 == 0) {
                double temp = 0;
                for (Integer curr : numbers) {
                    if (iterator == mid) {
                        temp += curr;
                    } else if (iterator == mid + 1) {
                        temp += curr;
                        break;
                    }
                    iterator++;
                }
                median = temp / 2;
            } else {
                for (Integer curr : numbers) {
                    if (iterator == mid) {
                        median = (double) curr;
                        break;
                    }
                    iterator++;
                }
            }
        }

        public double getMedian() {
            return median;
        }
    }
}

