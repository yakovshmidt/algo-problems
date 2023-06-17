package kz.home.ys.algo.easy.binaryWatch;

import java.util.ArrayList;
import java.util.List;

class BinaryWatch {

    private static final List<Integer> HOURS_AND_MINUTES = List.of(1,2,4,8, 1,2,4,8,16,32);

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        readPossibleTimes(turnedOn, 0, 0, result, 0);
        return result;
    }

    private void readPossibleTimes(int limit, int mins, int hours, List<String> result, int position) {
        if (limit == 0) {
            if (mins <= 59 && hours <= 11) {
                result.add(hours + ":" + ((mins < 10) ? ("0" + mins) : mins));
            }
            return;
        }
        for (int i = position; i < HOURS_AND_MINUTES.size(); i++) {
            if (isHour(i)) hours += HOURS_AND_MINUTES.get(i);
            else mins += HOURS_AND_MINUTES.get(i);

            readPossibleTimes(limit - 1, mins, hours, result, i + 1);

            if (isHour(i)) hours -= HOURS_AND_MINUTES.get(i);
            else mins -= HOURS_AND_MINUTES.get(i);
        }
    }

    private boolean isHour(int i) {
        return i >= 0 && i <= 3;
    }
}