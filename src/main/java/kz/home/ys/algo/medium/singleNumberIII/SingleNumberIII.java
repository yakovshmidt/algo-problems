package kz.home.ys.algo.medium.singleNumberIII;

class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
       int bitmask = 0;
       for (int num : nums) bitmask ^= num;

        System.out.println(bitmask);

       int diff = bitmask & (-bitmask);

        System.out.println(diff);
       
       int x = 0;
       for (int num : nums) {
           if ((num & diff) != 0) x ^= num;
       }

       return new int[] {x, bitmask ^ x};
    }
}