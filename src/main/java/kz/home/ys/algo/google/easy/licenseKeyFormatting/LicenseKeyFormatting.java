package kz.home.ys.algo.google.easy.licenseKeyFormatting;

class LicenseKeyFormatting {

    // time - O(N)
    // space - O(N)
    public String licenseKeyFormatting(String s, int k) {
        /*
        
        Approach:
            1. iterate over s backwards
            2. count added words to groups
            3. split groups when count == k
            4. skip - during iterations
            5. convert all lower cased letters to upper cased letters
                5.1 ASCII upper from 65 to 90
                5.2 ASCII lower from 97 to 122
            
            time - O(N)
            space - O(N)
        
        */
        
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int idx = s.length() - 1; idx >= 0; idx--) {
            char curr = s.charAt(idx);
            
            if (curr == '-') continue;
            
            if (count == k) {
                sb.append("-");
                count = 0;
            }
            
            if (curr >= 97 && curr <= 122) {
                sb.append((char)(curr - 32));
            } else {
                sb.append(curr);
            }
            
            count++;
        }
        
        return sb.reverse().toString();
    }
}













