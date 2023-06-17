package kz.home.ys.algo.easy.excelSheetColumnTitle;

class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber != 0) {
            int reminder = (columnNumber - 1) % 26;
            columnNumber = (columnNumber - 1) / 26;
            sb.append((char) (reminder + 65));
        }
        return sb.reverse().toString();
    }
}