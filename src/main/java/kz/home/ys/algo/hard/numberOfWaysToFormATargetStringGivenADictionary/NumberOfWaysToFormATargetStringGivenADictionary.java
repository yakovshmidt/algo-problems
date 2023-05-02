package kz.home.ys.algo.hard.numberOfWaysToFormATargetStringGivenADictionary;

public class NumberOfWaysToFormATargetStringGivenADictionary {

    private static final int MOD = 1000000007;
    private int[][] count;

    // time - O(NUMBER_OF_WORDS * WORD_LENGTH + O(WORD_LENGTH * TARGET_LENGTH)
    // space - O(26 * WORD_LENGTH) + O(WORD_LENGTH * TARGET_LENGTH) -> O(WORD_LENGTH * TARGET_LENGTH)
    public int numWays(String[] words, String target) {
        // space - O(26 * WORD_LENGTH)
        count = new int[26][words[0].length()];

        // time - O(NUMBER_OF_WORDS * WORD_LENGTH)
        for (int i = 0; i < words[0].length(); i++) {
            for (String word : words) {
                count[word.charAt(i) - 'a'][i]++;
            }
        }

        // time - O(WORD_LENGTH * TARGET_LENGTH) for dp matrix
        // space - O(WORD_LENGTH * TARGET_LENGTH) for dp matrix
        return (int) numWays(words, target, 0, 0, count, new Integer[words[0].length()][target.length()]);
    }

    private long numWays(String[] words, String target, int targetLetterIdx, int wordsLetterIdx, int[][] count, Integer[][] dp) {
        if (targetLetterIdx == target.length()) return 1;
        if (wordsLetterIdx == words[0].length()) return 0;
        if (dp[wordsLetterIdx][targetLetterIdx] != null) return dp[wordsLetterIdx][targetLetterIdx] % MOD;

        long take = 0;
        int targetLetter = target.charAt(targetLetterIdx) - 'a';
        if (count[targetLetter][wordsLetterIdx] > 0) {
            take = (count[targetLetter][wordsLetterIdx] % MOD) * (numWays(words, target, targetLetterIdx + 1, wordsLetterIdx + 1, count, dp) % MOD) % MOD;
        }
        long notTake = numWays(words, target, targetLetterIdx, wordsLetterIdx + 1, count, dp) % MOD;

        return dp[wordsLetterIdx][targetLetterIdx] = (int) ((notTake + take) % MOD);
    }
}
