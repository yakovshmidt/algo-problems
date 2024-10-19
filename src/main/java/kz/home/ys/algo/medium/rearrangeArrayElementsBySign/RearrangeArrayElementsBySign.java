//class Solution {
//
//    private Map<Character, Integer> lettersToFrequencies = new HashMap<>();
//    private Map<String, Long> subsToSums = new HashMap<>();
//    private int maxSum = Integer.MIN_VALUE;
//    private int occurrences = 0;
//
//    public int countKSubsequencesWithMaxBeauty(String s, int k) {
//        fillLettersToFrequencies(s);
//
//        countKSubsequencesWithMaxBeauty(s, “”, k, 0, new HashSet<>());
//
//        return occurrences;
//    }
//
//    // A k-subsequence is a subsequence of s, having length k, and all its characters are unique,
//// i.e., every character occurs once.
//// s = abbcd
//    private void countKSubsequencesWithMaxBeauty(String s, String subS, int k, int idx, Set<Character> visited) {
//        if (k == 0) {
//            long sum = 0;
//            if (subsToSums.containsKey(subS) {
//                sum = subsToSums.get(subS);
//            } else {
//                for (char letter : subS.toCharArray()) {
//                    int frequency = lettersToFrequencies.get(letter);
//                    sum += frequency;
//                    sum *= 1_000_000_007;
//                }
//                subsToSums.put(subS, sum);
//            }
//
//            if (maxSum < sum) {
//                maxSum = sum;
//                occurrences = 1;
//            } else if (maxSum == sum) {
//                occurrences++;
//            }
//
//            return;
//        }
//        if (idx >= s.length()) return;
//
//        char letter = s.charAt(idx);
//
//        if (visited.contains(letter)) return;
//
//        visited.add(letter);
//        countKSubsequencesWithMaxBeauty(s, subS + letter, k - 1, idx + 1, visited);
//        visited.remove(letter);
//
//        countKSubsequencesWithMaxBeauty(s, subS, k, idx + 1, visited);
//    }
//
//    private void fillLettersToFrequencies(String s) {
//        for (char letter : s.toCharArray()) {
//            lettersToFrequencies.put(letter, lettersToFrequencies.getOrDefault(letter, 0) + 1);
//
//        }
//
//    }
//
//}
