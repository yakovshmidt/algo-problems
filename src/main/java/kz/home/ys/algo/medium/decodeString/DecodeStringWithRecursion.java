package kz.home.ys.algo.medium.decodeString;

class DecodeStringWithRecursion {
    
    int idx = 0;

    // time - O(max(K) * N)
    // space - O(N)
    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();

        while (idx < s.length() && s.charAt(idx) != ']') {
            if (!Character.isDigit(s.charAt(idx))) {
                result.append(s.charAt(idx++));
            } else {
                int k = 0;
                while (idx < s.length() && Character.isDigit(s.charAt(idx))) {
                    k = k * 10 + s.charAt(idx++) - '0';
                }
                idx++;
                String decodedString = decodeString(s);
                idx++;

                while (k-- > 0) {
                    result.append(decodedString);
                }
            }
        }

        return result.toString();
    }
}