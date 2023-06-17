package kz.home.ys.algo.easy.thirdMaximumNumber;

class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int uniqueNum = 0;
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int num : nums) {
            if (first == num || second == num || third == num) continue;
            uniqueNum++;
            if (first <= num) {
                third = second;
                second = first;
                first = num;
            } else if (second <= num) {
                third = second;
                second = num;
            } else if (third <= num) {
                third = num;
            }
        }

        if (uniqueNum < 3) return (int) first;

        return (int) third;
    }
}