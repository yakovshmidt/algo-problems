package kz.home.ys.algo.easy.reformatDate;

import java.util.HashMap;
import java.util.Map;

class ReformatDate {
   
    public String reformatDate(String date) {
        Map<String, String> months = new HashMap<>();
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");

        String[] splitDate = date.split(" ");
        String day = splitDate[0];
        if (day.length() == 3) {
            day = "0" + day.charAt(0);
        } else {
            day = day.substring(0, 2);
        }
        String month = splitDate[1];
        String year = splitDate[2];

        return year + "-" + months.get(month) + "-" + day;
    }
}