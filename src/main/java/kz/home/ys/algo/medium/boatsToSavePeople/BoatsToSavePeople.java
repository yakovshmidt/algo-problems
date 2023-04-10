package kz.home.ys.algo.medium.boatsToSavePeople;

import java.util.Arrays;

class BoatsToSavePeople {

    // time - O(N)
    // space - O(1)
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int numberOfBoats = 0;
        int l = 0;
        int r = people.length - 1;
        // people = [1,1,1,1], limit = 4
        while (l <= r) {
            numberOfBoats++;
            if (people[l] + people[r] <= limit) l++;
            r--;
        }

        return numberOfBoats; 
    }
}