package kz.home.ys.algo.medium.takeKOfEachCharacterFromLeftAndRight;

public class TakeKOfEachCharacterFromLeftAndRight {

    // time - O(N)
    // space - O(1)
    public int takeCharacters(String s, int k) {
        int[] arr = new int[3];
        for (char curr : s.toCharArray()) {
            arr[curr - 'a']++;
        }

        if (arr[0] < k || arr[1] < k || arr[2] < k) return -1;

        int sum;
        int l = s.length() - 1;
        int r = s.length() - 1;
        int mini = Integer.MAX_VALUE;
        while (l >= 0 && r >= 0) {
            arr[s.charAt(l--) - 'a']--;
            boolean isValid = arr[0] >= k && arr[1] >= k && arr[2] >= k;
            while (!isValid && r >= 0) {
                arr[s.charAt(r--) - 'a']++;
            }
            sum = arr[0] + arr[1] + arr[2];
            mini = Math.min(sum, mini);
        }

        return mini;
    }
}
