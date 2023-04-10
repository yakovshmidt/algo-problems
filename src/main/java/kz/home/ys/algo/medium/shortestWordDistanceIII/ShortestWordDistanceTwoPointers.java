package kz.home.ys.algo.medium.shortestWordDistanceIII;

class ShortestWordDistanceTwoPointers {

    // time - O(N)
    // space - O(1)
    public int shortestWordDistance(String[] wordsDict, String word1, String word2) {
        int prevIdx = -1;
        int shortestDistance = Integer.MAX_VALUE;
        for (int i = 0; i < wordsDict.length; i++) {
            String currWord = wordsDict[i];
            if (currWord.equals(word1) || currWord.equals(word2)) {
                if (prevIdx != -1 && (!wordsDict[prevIdx].equals(currWord) || word1.equals(word2))) {
                    shortestDistance = Math.min(shortestDistance, i - prevIdx);
                } 
                prevIdx = i;
            }
        }
        return shortestDistance;
    }
}