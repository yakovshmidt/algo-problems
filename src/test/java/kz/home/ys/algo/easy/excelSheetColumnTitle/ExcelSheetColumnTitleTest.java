package kz.home.ys.algo.easy.excelSheetColumnTitle;

import junit.framework.TestCase;

public class ExcelSheetColumnTitleTest extends TestCase {

    public void testConvertToTitle() {
        String result = new ExcelSheetColumnTitle().convertToTitle(28);

        assertEquals("AB", result);
    }

    public static void main(String[] args) {
        System.out.println('A' - 65);
    }
}