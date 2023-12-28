package kz.home.ys.algo.medium.designSQL;

import junit.framework.TestCase;

import java.util.List;

public class DesignSQLTest extends TestCase {

    public void testDesignSQL() {
        DesignSQL sql = new DesignSQL(List.of("one", "two", "three"), List.of(2, 3, 1));
        sql.insertRow("two", List.of("first", "second", "third")); // adds a row to the table "two". Its id is 1.
        assertEquals("third", sql.selectCell("two", 1, 3)); // return "third", finds the value of the third column in the row with id 1 of the table "two".
        sql.insertRow("two", List.of("fourth", "fifth", "sixth")); // adds another row to the table "two". Its id is 2.
        sql.deleteRow("two", 1); // deletes the first row of the table "two". Note that the second row will still have the id 2.
        assertEquals("fifth", sql.selectCell("two", 2, 2)); // return "fifth", finds the value of the second column in the row with id 2 of the table "two".
    }
}