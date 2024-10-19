package kz.home.ys.algo.medium.largestPalindromicNumber;

class LargestPalindromicNumber {
    public String largestPalindromic(String num) {
        if (allZeros(num)) return "0";

        int[] counts = new int[10];
        for (int i = 0; i < num.length(); i++) {
            int digit = Character.getNumericValue(num.charAt(i));
            counts[digit]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int digit = counts.length - 1; digit >= 0; digit--) {
            int count = counts[digit];
            if (count >= 2) {
                int half = count / 2;
                while (half > 0) {
                    sb.append(digit);
                    half--;
                }
                counts[digit] = count % 2;
            }
        }

        boolean allZeros = true;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '0') {
                allZeros = false;
                break;
            }
        }

        Integer dig = null;
        for (int digit = counts.length - 1; digit >= 0; digit--) {
            if (counts[digit] == 1) {
                if (allZeros) return digit + "";
                dig = digit;
                break;
            }
        }

        return new String(sb) + (dig == null ? "" : dig) + sb.reverse();
    }

    private boolean allZeros(String num) {
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) != '0') return false;
        }
        return true;
    }
}