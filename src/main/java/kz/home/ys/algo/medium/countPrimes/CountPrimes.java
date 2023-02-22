package kz.home.ys.algo.medium.countPrimes;

class CountPrimes {
    public int countPrimes(int n) {
        /*

        Approach:

        1. iterate over all n numbers from [2, n]
        2. for each number we iterate again from [2, curr}

        time - O(N^3)
        space - O(1)

        */

        if (n == 0 || n == 1) return 0;

        int primeNumbersCount = 0;
        for (int b = 2; b < n; b++) {
            primeNumbersCount++;
            for (int a = 1; a < b; a++) {
                boolean isPrime = isPrime(a, b);
                if (!isPrime) {
                    primeNumbersCount--;
                    break;
                }
            }
        }
        return primeNumbersCount;
    }

    private boolean isPrime(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a == 1;
    }
}