package kz.home.ys.algo.easy.addBinary;

class AddBinary {
    public String addBinary(String a, String b) {
        /*
        
        Approach:
        1) iterate over a and b -> 
        2) compare them:
            * if one char is 0 and another is 0 to -> do not change
            * if one of them is 1 -> add one to the result
            * if both are 1 -> add zero to the result and store remaining part as 1
        3) repeat using remaining part

        Time: O(MAX(A, B))
        Space: O(MAX(A,B) + 1)
        
        */

        StringBuilder sb = new StringBuilder();
        int aIdx = a.length() - 1;
        int bIdx = b.length() - 1;
        int reminder = '0';
        while (aIdx >= 0 || bIdx >= 0) {
            char aChar = (aIdx < 0) ? '0' : a.charAt(aIdx);
            char bChar = (bIdx < 0) ? '0' : b.charAt(bIdx);

            if (aChar == '0' && bChar == '0') {
                if (reminder != '0') {
                    sb.append('1');
                } else {
                    sb.append('0');
                }
                reminder = '0';
            } else if (aChar == '1' && bChar == '1') {
                if (reminder != '0') {
                    sb.append('1');
                } else {
                    sb.append('0');
                    reminder = '1';
                }
            } else {
                if (reminder != '0') {
                    sb.append('0');
                } else {
                    sb.append('1');
                }
            }
            
            aIdx--;
            bIdx--;
        }

        if (reminder == '1') {
            sb.append('1');
        }

        return sb.reverse().toString();
    }
}