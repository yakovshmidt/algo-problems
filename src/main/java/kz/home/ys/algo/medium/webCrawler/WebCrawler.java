package kz.home.ys.algo.medium.webCrawler;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * // This is the HtmlParser's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface HtmlParser {
 * public List<String> getUrls(String url) {}
 * }
 */

class WebCrawler {
    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        /* 
        
        Approach:

        * get all urls and check all possible urls to crawl by prefix
            * split url correctly. if the url is http://news.yahoo.com/news/topics/ -> http://news.yahoo.com
        
        There are 2 types of urls:
        1. http://news.yahoo.com/
        2. http://news.yahoo.com

        */

        List<String> urls = htmlParser.getUrls(startUrl);
        System.out.println(urls);

        String urlPrefix = findUrlPrefix(startUrl);
        System.out.println(urlPrefix);

        List<String> resultedUrls = new ArrayList<>();
        for (String url : urls) {
            if (url.startsWith(urlPrefix)) {
                resultedUrls.add(url);
            }
        }
        return resultedUrls;
    }

    public static void main(String[] args) {
        Date dateBefore = new Date(2022, 2, 10);
        Date dateAfter = new Date(2022, 5, 11);

        long dateBeforeInMs = dateBefore.getTime();
        long dateAfterInMs = dateAfter.getTime();

        long timeDiff = Math.abs(dateAfterInMs - dateBeforeInMs);
        long daysDiff = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateAfter);
        int actualMinimum = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println(actualMinimum);
    }

    private static Date getFirstDayOfQuarter(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.MONTH, cal.get(Calendar.MONTH)/3 * 3);
        return cal.getTime();
    }

    private static Date getLastDayOfQuarter(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.MONTH, cal.get(Calendar.MONTH)/3 * 3 + 2);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        return cal.getTime();
    }

    private String findUrlPrefix(String startUrl) {
        int currNumberOfSlashes = 0;
        int endIdx = 0;
        for (int i = 0; i < startUrl.length(); i++) {
            char curr = startUrl.charAt(i);
            if (curr == '/') {
                currNumberOfSlashes++;
            }
            endIdx = i;
            if (currNumberOfSlashes == 3) {
                break;
            }
        }

        return startUrl.substring(0, endIdx);
    }
}