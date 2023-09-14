package kz.home.ys.algo.easy.determineIfTwoEventsHaveConflict;

class DetermineIfTwoEventsHaveConflict {
    public boolean haveConflict(String[] event1, String[] event2) {
        int start1 = toMins(event1[0]);
        int end1 = toMins(event1[1]);
        int start2 = toMins(event2[0]);
        int end2 = toMins(event2[1]);

        return (start1 >= start2 && start1 <= end2) || (start2 >= start1 && start2 <= end1);
    }

    private int toMins(String time) {
        String[] splitTime = time.split(":");
        return Integer.parseInt(splitTime[0]) * 60 + Integer.parseInt(splitTime[1]);
    }
}