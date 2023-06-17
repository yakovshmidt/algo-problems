package kz.home.ys.algo.easy.studentAttendanceRecordI;

class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        int numberOfAbsences = 0;
        int numberOfLatesInARow = 0;
        int i = 0;
        while (i < s.length()) {
            char letter = s.charAt(i);
            if (letter == 'A') {
                numberOfAbsences++;
                if (numberOfAbsences == 2) return false;
                i++;
            } else if (letter == 'L') {
                while (letter == 'L') {
                    numberOfLatesInARow++;
                    i++;
                    if (i == s.length()) break;
                    letter = s.charAt(i);
                }
                if (numberOfLatesInARow >= 3) return false;
                numberOfLatesInARow = 0;
            } else {
                i++;
            }
        }
        return true;
    }
}