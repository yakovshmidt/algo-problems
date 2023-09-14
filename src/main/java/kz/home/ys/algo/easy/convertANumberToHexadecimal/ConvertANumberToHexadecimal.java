package kz.home.ys.algo.easy.convertANumberToHexadecimal;

class ConvertANumberToHexadecimal {

    public String toHex(int num) {
        if (num == 0) return "0";

        long val = num;
        if (val < 0) {
            val = (long) (Math.pow(2,32) + num);
        }

        String hexDigits = "0123456789abcdef";

        StringBuilder hexNum = new StringBuilder();
        while (val != 0) {
            long mod = val % 16;
            char hexDigit = hexDigits.charAt((int) mod);

            hexNum.append(hexDigit);

            val /= 16;
        }

        return hexNum.reverse().toString();
    }
}