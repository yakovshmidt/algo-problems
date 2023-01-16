package kz.home.ys.algo.medium.countAndSay;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CountAndSayRegularExpression {

    public String countAndSay(int n) {
        String currentString = "1";
        // pattern to match the repetitive digits
        Pattern pattern = Pattern.compile("(.)\\1*");
        for (int i = 1; i < n; ++i) {
            Matcher m = pattern.matcher(currentString);
            StringBuilder nextString = new StringBuilder();
            // each group contains identical and adjacent digits
            while (m.find()) {
                nextString.append(m.group().length()).append(m.group().charAt(0));
            }
            // prepare for the next iteration
            currentString = nextString.toString();
        }
        return currentString;
    }
}