package kz.home.ys.algo.medium.minimumAddToMakeParenthesesValid;

class MinimumAddToMakeParenthesesValid {

    // time - O(N)
    // space - O(1)
    public int minAddToMakeValid(String s) {
        int numberOfAdds = 0;
        int balance = 0;
        for (char p : s.toCharArray()) {
            balance += (p == '(') ? 1 : -1;
            if (balance == -1) {
                numberOfAdds++;
                balance++;
            }
        }

        return numberOfAdds + balance;
    }
}