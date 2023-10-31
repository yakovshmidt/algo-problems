package kz.home.ys.algo.medium.nextClosestTime;

import java.util.HashSet;
import java.util.Set;

class NextClosestTime {

    // time - O(24 * 60) -> O(1)
    // space - O(1)
    public String nextClosestTime(String time) {
        Set<Integer> digits = new HashSet<>();
        for (char d : time.toCharArray()) {
            if (Character.isDigit(d)) {
                digits.add(Character.getNumericValue(d));
            }
        }
        
        int mins = Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3));

        while (true) {
            mins++;
            if (mins == 24 * 60) mins = 0;

            int H = (mins / 60) / 10;
            int h = (mins / 60) % 10;

            int M = (mins % 60) / 10;
            int m = (mins % 60) % 10;

            if (!digits.contains(H) || !digits.contains(h) || !digits.contains(M) || !digits.contains(m)) {
                continue;
            }

            return String.valueOf(H) + h + ":" + M + m;
        }
    }
}