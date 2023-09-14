package kz.home.ys.algo.hard.maximumStudentsTakingExam;

import junit.framework.TestCase;

public class MaximumStudentsTakingExamTest extends TestCase {

    public void testMaxStudents() {
        int maxStudents = new MaximumStudentsTakingExam().maxStudents(
                new char[][]{
                        {'#', '.', '#', '#', '.', '#'},
                        {'.', '#', '#', '#', '#', '.'},
                        {'#', '.', '#', '#', '.', '#'}}
        );

        assertEquals(4, maxStudents);
    }
}