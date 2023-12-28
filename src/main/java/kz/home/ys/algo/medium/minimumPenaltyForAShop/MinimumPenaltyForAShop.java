package kz.home.ys.algo.medium.minimumPenaltyForAShop;

class MinimumPenaltyForAShop {
    public int bestClosingTime(String customers) {
        int earliestHour = 0;
        int minPenalties = 0;
        int penalties = 0;
        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) == 'Y') {
                penalties--;
            } else {
                penalties++;
            }

            if (minPenalties > penalties) {
                minPenalties = penalties;
                earliestHour = i + 1;
            }
        }

        return earliestHour;
    }
}