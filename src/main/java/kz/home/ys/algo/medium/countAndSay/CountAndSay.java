package kz.home.ys.algo.medium.countAndSay;

class CountAndSay {

    // time - O(N * MAX(numbers_count))
    // space - O(N * MAX(numbers_count))
    public String countAndSay(int n) {
        if (n == 0) return "";
        if (n == 1) return "1";

        return countAndSay("1", 2, n);
    }

    private String countAndSay(String result, int currIteration, int n) {
        if (currIteration > n) return result;

        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (idx < result.length()) {
            char prev = result.charAt(idx);
            int count = 0;
            while (idx < result.length() && prev == result.charAt(idx)) {
                count++;
                idx++;
            }
            
            sb.append(count);
            sb.append(prev);
        }

        return countAndSay(sb.toString(), currIteration + 1, n);
    }
}