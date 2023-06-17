package kz.home.ys.algo.easy.designParkingSpace;

class ParkingSystem {

    /*
    
    Constraints:
    * 0 <= b,m,s <= 1000
    * carType is 1,2,3
    * At most 1000 calls will be made to addCar

    Approach:
    1) add sizes;
    2) increment sizes

    Time: O(N) - where N is number of calls of addCar method

    Space: O(1)
    
    */

    private final int maxBig;
    private final int maxMedium;
    private final int maxSmall;

    private int currBig;
    private int currMedium;
    private int currSmall;

    public ParkingSystem(int big, int medium, int small) {
        this.maxBig = big;
        this.maxMedium = medium;
        this.maxSmall = small;
    }
    
    public boolean addCar(int carType) {
        if (carType == 1) {
            currBig++;
            return currBig <= maxBig;
        } else if (carType == 2) {
            currMedium++;
            return currMedium <= maxMedium;
        } else {
            currSmall++;
            return currSmall <= maxSmall;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */