package kz.home.ys.algo.easy.validPalindrome;

class ValidPalindromeWithoutExtraSpace {
    public boolean isPalindrome(String s) {
        /* 
        
        Constraints:
        * 1 <= s.length <= 2 * 10^5
        * ASCII characters

        Approach:
        1) iterate over the s using two pointers
            leftIdx = 0, rightIdx = s.length() - 1;
        
        Example: "A man, a plan, a canal: Panama"
                         |
                                           |

        Time: O(N)

        Space: O(1)
        
        */
        int leftIdx = 0;
        int rightIdx = s.length() - 1;
        while (leftIdx <= rightIdx) {
            char left = s.charAt(leftIdx);
            while (leftIdx < rightIdx && !Character.isLetter(left) && !Character.isDigit(left)) {
                leftIdx++;
                left = s.charAt(leftIdx);
            }
            left = convertLowerToUpperCaseIfNeeded(left);

            char right = s.charAt(rightIdx);
            while (leftIdx < rightIdx && !Character.isLetter(right) && !Character.isDigit(right)) {
                rightIdx--;
                right = s.charAt(rightIdx);
            }
            right = convertLowerToUpperCaseIfNeeded(right);
            if (right != left) return false;
            leftIdx++;
            rightIdx--;
        }
        return true;
    }

    private char convertLowerToUpperCaseIfNeeded(char left) {
        if ((int) left >= 97 && (int) left <= 122) {
            left = (char) ((int) left - 32);
        }
        return left;
    }
}