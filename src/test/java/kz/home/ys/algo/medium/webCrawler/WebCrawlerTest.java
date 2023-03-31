package kz.home.ys.algo.medium.webCrawler;

import junit.framework.TestCase;

import java.util.List;

public class WebCrawlerTest extends TestCase {

    public void testCrawl() {
        List<String> crawledUrls = new WebCrawler().crawl("http://news.yahoo.com/news/topics/", new HtmlParser());

        assertEquals(4, crawledUrls.size());
    }
}