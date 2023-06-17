package kz.home.ys.algo.easy.dayOfTheWeek;

class DayOfTheWeek {

    private final int[] daysInMonth = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final String[] dayOfWeek = {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};

    public String dayOfTheWeek(int day, int month, int year) {
        int days = 0;
        for (int i = 1971; i < year; i++) {
            days += isLeapYear(i) ? 366 : 365;
        }

        for (int i = 1; i < month; i++) {
            if (i == 2) {
                days += isLeapYear(year) ? 29 : 28;
            } else {
                days += daysInMonth[i - 1];
            }
        }

        days += day - 1;

        return dayOfWeek[days % 7];
    }

    private boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}