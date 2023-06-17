package kz.home.ys.algo.easy.dayOfTheYear;

class DayOfTheYear {
    
    private final int[] daysInMonth = new int[] {31, 28,31, 30,31,30,31,31,30,31,30,31};
    
    public int dayOfYear(String date) {
        String[] splitDate = date.split("-");
        int year = Integer.parseInt(splitDate[0]);
        int month = Integer.parseInt(splitDate[1]) - 1;
        int day = Integer.parseInt(splitDate[2]);

        int dayOfTheYear = 0;
        for (int i = 0; i < month; i++) {
            dayOfTheYear += daysInMonth[i];

            if (i == 1 && isLeapYear(year)) {
                dayOfTheYear++;
            }
        }
        dayOfTheYear += day;

        return dayOfTheYear;
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