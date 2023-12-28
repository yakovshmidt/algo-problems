package kz.home.ys.algo.easy.strobogrammaticNumber;

import java.util.HashMap;
import java.util.Map;

class StrobogrammaticNumber {
    public boolean isStrobogrammatic(String num) {
        Map<Character, Character> strobogrammaticNums = new HashMap<>();
        strobogrammaticNums.put('6', '9');
        strobogrammaticNums.put('9', '6');
        strobogrammaticNums.put('8', '8');
        strobogrammaticNums.put('0', '0');
        strobogrammaticNums.put('1', '1');

        int l = 0;
        int r = num.length() - 1;
        while (l <= r) {
            if (strobogrammaticNums.containsKey(num.charAt(l)) && strobogrammaticNums.get(num.charAt(l)) == num.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        } 

        return true;
    }
}