package kz.home.ys.algo.hard.nextPalindromeUsingSameDigits;

class NextPalindromeUsingSameDigits {
    public String nextPalindrome(String num) {
        int n = num.length();
        char[] half = new char[n / 2];
        for (int i = 0; i < half.length; i++) {
            half[i] = num.charAt(i);
        }

        if (!nextPermutation(half)) return "";

        StringBuilder sb = new StringBuilder(); 
        sb.append(half);

        if (n % 2 == 0) return sb + sb.reverse().toString();
        else return sb.toString() + num.charAt(n / 2) + sb.reverse();
    }

    private boolean nextPermutation(char[] nums) {
        int n = nums.length - 1, p = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                p = i;
                break;
            }
        }

        if (p == -1) return false;

        for (int i = n; i >= 0; i--) {
            if (nums[i] > nums[p]) {
                swap(nums, i, p);
                break;
            }
        }
        reverse(nums, p + 1, n);
        return true;
    }

    private void reverse(char[] nums, int s, int e) {
        while (s < e) swap(nums, s++, e--);
    }

    private void swap(char[] nums, int i, int p) {
        char temp = nums[i];
        nums[i] = nums[p];
        nums[p] = temp;
    }
}