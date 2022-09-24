package kz.home.ys.algo.easy.validParentheses;

class ValidParenthesesWithoutStack {

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        int stackPtr = 0;
        for (int i = 0; i < chars.length; i++) {        
            if (chars[i] == '(') {
                chars[stackPtr++] = ')';
            } else if (chars[i] == '[') {
                chars[stackPtr++] = ']';
            } else if (chars[i] == '{') {
                chars[stackPtr++] = '}';
            } else if (stackPtr == 0 || chars[--stackPtr] != chars[i]) {
                return false;
            }
        }
        return stackPtr == 0;
    }
}