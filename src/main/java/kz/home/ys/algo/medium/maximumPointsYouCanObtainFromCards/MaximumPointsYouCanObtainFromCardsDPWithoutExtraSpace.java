package kz.home.ys.algo.medium.maximumPointsYouCanObtainFromCards;

class MaximumPointsYouCanObtainFromCardsDPWithoutExtraSpace {

    // time - O(K)
    // space - O(1)
    public int maxScore(int[] cardPoints, int k) {
        int frontScore = 0;
        int rearScore = 0;

        for (int i = 0; i < k; i++) {
            frontScore += cardPoints[i];
        }

        int maxScore = frontScore;
        for (int i = k - 1; i >= 0; i--) {
            frontScore -= cardPoints[i];
            rearScore += cardPoints[cardPoints.length - (k - i)];

            maxScore = Math.max(maxScore, frontScore + rearScore);
        }

        return maxScore;
    }
}