package kz.home.ys.algo.medium.maximumPointsYouCanObtainFromCards;

class MaximumPointsYouCanObtainFromCardsDP {

    // time - O(K)
    // space - O(K)
    public int maxScore(int[] cardPoints, int k) {
        int[] frontSetOfCards = new int[k + 1];
        int[] rearSetOfCards = new int[k + 1];

        for (int i = 0; i < k; i++) {
            frontSetOfCards[i + 1] = cardPoints[i] + frontSetOfCards[i];
            rearSetOfCards[i + 1] = cardPoints[cardPoints.length - i - 1] + rearSetOfCards[i];
        }

        int maxScore = 0;
        for (int i = 0; i <= k; i++) {
            int currScore = frontSetOfCards[i] + rearSetOfCards[k - i];
            maxScore = Math.max(maxScore, currScore);
        }

        return maxScore;
    }
}