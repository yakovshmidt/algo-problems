package kz.home.ys.algo.easy.excelSheetColumnNumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExcelSheetColumnNumberTest {

    @Test
    public void testTitleToNumber() {
        int result = new ExcelSheetColumnNumber().titleToNumber("ZY");

        assertEquals(701, result);
    }
}