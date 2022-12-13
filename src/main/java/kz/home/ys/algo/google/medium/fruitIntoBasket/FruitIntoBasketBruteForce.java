package kz.home.ys.algo.google.medium.fruitIntoBasket;

class FruitIntoBasketBruteForce {

    // time - O(N^2)
    // space - O(1)
    public int totalFruit(int[] fruits) {
        if (fruits.length == 1) return 1;

        int maxCount = 0;
        
        int fruitOne = fruits[0];
        int fruitTwo = -1;
        
        int fruitOneCount = 1;
        int fruitTwoCount = 0;
        
        int i = 0;
        int j = 1;
        
        while (j < fruits.length) {
            int fruitJ = fruits[j];
            if (fruitOne == -1 || fruitJ == fruitOne) {
                fruitOne = fruitJ;
                fruitOneCount++;
                j++;
                maxCount = Math.max(maxCount, fruitOneCount + fruitTwoCount);
                
                continue;
            } 
            
            if (fruitTwo == -1 || fruitJ == fruitTwo) {
                fruitTwo = fruitJ;
                fruitTwoCount++;
                j++;
                maxCount = Math.max(maxCount, fruitOneCount + fruitTwoCount);
                
                continue;
            }
            
            if (fruitTwo != fruitJ && fruitOne != fruitJ) {
                int fruitI = fruits[i];
                
                if (fruitI == fruitOne) {
                    fruitOneCount--;
                    if (fruitOneCount == 0) {
                        fruitOne = -1;
                    }
                } else {
                    fruitTwoCount--;
                    if (fruitTwoCount == 0) {
                        fruitTwo = -1;
                    }
                }
                i++;
            }
        }
        
        return maxCount;
    }
}