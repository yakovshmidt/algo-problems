package kz.home.ys.algo.medium.removeKDigits;

import java.util.LinkedList;

class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        LinkedList<Character> deque = new LinkedList<>();
        for (char digit : num.toCharArray()) {
            while (!deque.isEmpty() && k > 0 && deque.peekLast() > digit) {
                deque.removeLast();
                k -= 1;
            }
            deque.addLast(digit);
        }

        for (int i = 0; i < k; ++i) {
            deque.removeLast();
        }

        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;
        for (char digit : deque) {
            if (leadingZero && digit == '0') continue;
            leadingZero = false;
            sb.append(digit);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}