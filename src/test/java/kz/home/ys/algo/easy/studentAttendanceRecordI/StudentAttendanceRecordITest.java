package kz.home.ys.algo.easy.studentAttendanceRecordI;

import junit.framework.TestCase;

public class StudentAttendanceRecordITest extends TestCase {

    public void testCheckRecord() {
        StudentAttendanceRecordI studentAttendanceRecordI = new StudentAttendanceRecordI();

        assertTrue(studentAttendanceRecordI.checkRecord("PPALLP"));
        assertFalse(studentAttendanceRecordI.checkRecord("PPALLL"));
    }
}