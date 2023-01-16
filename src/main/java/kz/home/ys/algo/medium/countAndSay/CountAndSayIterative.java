package kz.home.ys.algo.medium.countAndSay;

class CountAndSayIterative {

    public String countAndSay(int n) {
        String curr = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder next = new StringBuilder();
            for (int j = 0, k = 0; j < curr.length(); j = k) {
                while (k < curr.length() && curr.charAt(j) == curr.charAt(k)) k++;
                next.append(k - j).append(curr.charAt(j));
            }
            curr = next.toString();
        }
        return curr;
    }
}