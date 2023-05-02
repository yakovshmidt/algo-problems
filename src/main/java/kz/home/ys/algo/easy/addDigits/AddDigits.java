package kz.home.ys.algo.easy.addDigits;

class AddDigits {
    public int addDigits(int num) {
        int digitalRoot = 0;
        while (num > 0) {
            digitalRoot += num % 10;
            num /= 10;
            if (num == 0 && digitalRoot >9) {
                num = digitalRoot;
                digitalRoot = 0;
            }
        }
        return digitalRoot;
    }
}