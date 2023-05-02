package kz.home.ys.algo.medium.alertUsingSameKeyCardThreeOrMoreTimesInAOneHourPeriod;

import java.util.*;

public class AlertUsingSameKeyCardThreeOrMoreTimesInAOneHourPeriod {

    public List<String> alertNames(String[] keyName, String[] keyTime) {
        /*

        1. create hash map - names to times
        2. sort by keys
        3. iterate over the map and compare 3 neighbours. if they are in the same one-hour period -> add a name to the resulted list
            if not -> continue

        time - O(N)
        space - O(N)

        */
        Map<String, List<Integer>> namesToTimes = new HashMap<>();
        for (int i = 0; i < keyName.length; i++) {
            namesToTimes.putIfAbsent(keyName[i], new ArrayList<>());
            namesToTimes.get(keyName[i]).add(getTimeInMinutes(keyTime[i]));
        }

        Set<String> result = new TreeSet<>();
        for (var entry : namesToTimes.entrySet()) {
            String name = entry.getKey();
            List<Integer> times = entry.getValue();
            Collections.sort(times);

            for (int i = 0; i < times.size() - 2; i++) {
                boolean withinOneHour = (times.get(i + 2) - times.get(i)) <= 60;
                if (withinOneHour) {
                    result.add(name);
                    break;
                }
            }
        }

        return new ArrayList<>(result);
    }

    private int getTimeInMinutes(String time) {
        String[] hourToMinutes = time.split(":");
        int hourInMinutes = Integer.parseInt(hourToMinutes[0]) * 60;
        int minutes = Integer.parseInt(hourToMinutes[1]);

        return hourInMinutes + minutes;
    }
}
