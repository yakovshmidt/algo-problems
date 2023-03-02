package kz.home.ys.algo.easy.excelSheetColumnNumber;

class ExcelSheetColumnNumber {

    // time - O(N)
    // space - O(1)
    public int titleToNumber(String columnTitle) {
        // AB -> 2 * 26^0
        // A_ -> 1 * 26^1 -> 26

        // BB -> 2 * 26^0
        // B_ -> 2 * 26^1 -> 52

        // ZY -> 25 * 26^0 -> 25
        // Z_ -> 26 * 26^1 -> 

        int pow = 0;
        int idx = columnTitle.length() - 1; 
        int result = 0;
        while (idx >= 0) {
            char letter = columnTitle.charAt(idx);

            result += ((int) letter - 64) * (int)Math.pow(26, pow);

            idx--;
            pow++;
        }

        return result;
    }
}