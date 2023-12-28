package kz.home.ys.algo.medium.examRoom;

import junit.framework.TestCase;

public class ExamRoomTest extends TestCase {

    public void testExamRoot() {
        ExamRoom examRoom = new ExamRoom(10);

        assertEquals(0, examRoom.seat());
        assertEquals(9, examRoom.seat());
        assertEquals(4, examRoom.seat());
        assertEquals(2, examRoom.seat());
        examRoom.leave(4);
        assertEquals(5, examRoom.seat());
    }
}