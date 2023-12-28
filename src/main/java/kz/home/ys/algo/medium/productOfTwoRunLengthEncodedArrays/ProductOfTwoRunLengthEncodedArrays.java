package kz.home.ys.algo.medium.productOfTwoRunLengthEncodedArrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ProductOfTwoRunLengthEncodedArrays {
    public List<List<Integer>> findRLEArray(int[][] encoded1, int[][] encoded2) {
        /*
        
        Input: encoded1 = [[1,3],[2,1],[3,2]], encoded2 = [[2,3],[3,2]]
                                         |
                                                                   |

        Time - O(ENC_1_LEN + ENC_2_LEN)
        Space - O(ENC_1_LEN + ENC_2_LEN)

        */

        int idx1 = 0;
        int idx2 = 0;
        List<List<Integer>> result = new ArrayList<>();
        while (idx1 < encoded1.length) {
            int[] pair1 = encoded1[idx1];
            int[] pair2 = encoded2[idx2];

            int product = pair1[0] * pair2[0];
            int freq;
            if (pair1[1] == pair2[1]) {
                freq = pair2[1];
                idx1++;
                idx2++;
            } else if (pair1[1] > pair2[1]) {
                freq = pair2[1];
                pair1[1] = pair1[1] - pair2[1];
                idx2++;
            } else {
                freq = pair1[1];
                pair2[1] = pair2[1] - pair1[1];
                idx1++;
            }
            if (!result.isEmpty() && result.get(result.size() - 1).get(0) == product) {
                List<Integer> prev = result.get(result.size() - 1);
                prev.set(1, prev.get(1) + freq);
            } else {
                List<Integer> curr = new LinkedList<>();
                curr.add(product);
                curr.add(freq);
                result.add(curr);
            }
        }

        return result;
    }
}