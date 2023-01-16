package kz.home.ys.algo.medium.maximumPointsYouCanObtainFromCards;

class MaximumPointsYouCanObtainFromCards {

    // time - O(2^K)
    // space - O(2^K)
    public int maxScore(int[] cardPoints, int k) {
        return maxScore(cardPoints, k, 0, cardPoints.length - 1, 0);
    }

    private int maxScore(int[] cardPoints, int k, int l, int r, int result) {
        if (k == 0) return result;

        int left = cardPoints[l];
        int right = cardPoints[r];

        int leftResult = maxScore(cardPoints, k - 1, l + 1, r, result + left);
        int rightResult = maxScore(cardPoints, k - 1, l, r - 1, result + right);

        return Math.max(leftResult, rightResult);
    }
}