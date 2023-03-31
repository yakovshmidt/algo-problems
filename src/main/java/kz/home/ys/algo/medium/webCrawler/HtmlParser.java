package kz.home.ys.algo.medium.webCrawler;

import java.util.List;

public class HtmlParser {

    public List<String> getUrls(String url) {
        return List.of(
                "http://news.yahoo.com",
                "http://news.yahoo.com/news",
                "http://news.yahoo.com/news/topics/",
                "http://news.google.com",
                "http://news.yahoo.com/us"
        );
    }
}
