package kz.home.ys.algo.easy.selfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            boolean isSelfDividingNumber = true;
            int temp = i;
            while (temp > 0) {
                int reminder = temp % 10;
                if (reminder == 0 || i % reminder != 0) {
                    isSelfDividingNumber = false;
                    break;
                }
                temp = temp / 10;
            }
            if (isSelfDividingNumber) result.add(i);
        }
        return result;
    }
}