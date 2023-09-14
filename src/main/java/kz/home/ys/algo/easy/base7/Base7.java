package kz.home.ys.algo.easy.base7;

class Base7 {

    // time - O(log7(N))
    // space - O(log7(N))
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        boolean isNegative = num < 0;
        num = Math.abs(num);

        int result = 0;
        int power = 0;
        while (num != 0) {
            result += (num % 7) * Math.pow(10, power++);
            num /= 7;
        }

        return (isNegative ? "-" : "") + result;
    }
}