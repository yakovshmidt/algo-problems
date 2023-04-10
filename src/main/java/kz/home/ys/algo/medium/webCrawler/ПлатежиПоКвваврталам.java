/*
package kz.home.ys.algo.medium.webCrawler;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Main {

    */
/*
	Для чтения входных данных необходимо получить их
	из стандартного потока ввода (System.in).
	Данные во входном потоке соответствуют описанному
	в условии формату. Обычно входные данные состоят
	из нескольких строк. Можно использовать более производительные
	и удобные классы BufferedReader, BufferedWriter, Scanner, PrintWriter.

	С помощью BufferedReader можно прочитать из стандартного потока:
	* строку -- reader.readLine()
	* число -- int n = Integer.parseInt(reader.readLine());
	* массив чисел известной длины (во входном потоке каждое число на новой строке) --
	int[] nums = new int[len];
    for (int i = 0; i < len; i++) {
        nums[i] = Integer.parseInt(reader.readLine());
    }
	* последовательность слов в строке --
	String[] parts = reader.readLine().split(" ");

	Чтобы вывести результат в стандартный поток вывода (System.out),
	Через BufferedWriter можно использовать методы
	writer.write("Строка"), writer.write('A') и writer.newLine().

	Возможное решение задачи "Вычислите сумму чисел в строке":
	int sum = 0;
    String[] parts = reader.readLine().split(" ");
    for (int i = 0; i < parts.length; i++) {
        int num = Integer.parseInt(parts[i]);
        sum += num;
    }
    writer.write(String.valueOf(sum));
	*//*

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfLines = Integer.parseInt(reader.readLine());

		*/
/*

		1 -> from 01.01 to 31.03 -> 90 days
		2 -> 01.04 to 30.06 -> 91
		3 -> 01.07 to 30.09 -> 92
		4 -> 01.10 to 31.12 -> 92

		*//*


        double[] report = new double[4];

        for (int i = 0; i < numberOfLines; i++) {
            String[] parts = reader.readLine().split(" ");
            int amount = Integer.parseInt(parts[0]);

            String[] splitDateFrom = parts[1].split("\\.");
            String[] splitDateTo = parts[2].split("\\.");
            Date dateFrom = new Date(2022, Integer.parseInt(splitDateFrom[1]) - 1, Integer.parseInt(splitDateFrom[0]));
            Date dateTo = new Date(2022, Integer.parseInt(splitDateTo[1]) - 1, Integer.parseInt(splitDateTo[0]));

            boolean areInDifferentQuarters = areInDifferentQuarters(dateFrom, dateTo);

            if (areInDifferentQuarters) {
                int leftSideQuarterNumberOfDays = getNumberOfDaysBetween(dateFrom, getLastDayOfQuarter(dateFrom));
                int rightSideQuarterNumberOfDays = getNumberOfDaysBetween(getFirstDayOfQuarter(dateTo), dateTo);
                int totalDays = getNumberOfDaysBetween(dateFrom, dateTo);

                int leftSideAmount = (amount / totalDays) * leftSideQuarterNumberOfDays;
                int rightSideAmount = (amount / totalDays) * rightSideQuarterNumberOfDays;

                report[getQuarter(dateFrom)] += leftSideAmount;
                report[getQuarter(dateTo)] += rightSideAmount;
            } else {
                int totalDays = getNumberOfDaysBetween(getFirstDayOfQuarter(dateFrom), getLastDayOfQuarter(dateTo));
                int currDays = getNumberOfDaysBetween(dateFrom, dateTo);

                double = (amount / totalDays) * currDays;

                report[getQuarter(dateFrom)] += amount;
            }
        }

        for (double quarterAmount : report) {
            writer.write(String.valueOf(quarterAmount));
        }

        reader.close();
        writer.close();
    }

    private static int getNumberOfDaysBetween(Date dateFrom, Date dateTo) {
        long dateBeforeInMs = dateFrom.getTime();
        long dateAfterInMs = dateTo.getTime();

        long timeDiff = Math.abs(dateAfterInMs - dateBeforeInMs);

        return (int) TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
    }

    private static int getQuarter(Date date) {
        return (date.getMonth() / 3);
    }

    private static boolean areInDifferentQuarters(Date firstDate, Date secondDate) {
        return getQuarter(firstDate) != getQuarter(secondDate);
    }

    private static Date getFirstDayOfQuarter(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.MONTH, cal.get(Calendar.MONTH)/3 * 3);
        return cal.getTime();
    }

    private static Date getLastDayOfQuarter(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.MONTH, cal.get(Calendar.MONTH)/3 * 3 + 2);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        return cal.getTime();
    }
}
*/
