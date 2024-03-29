package kz.home.ys.algo.easy.constructTheRectangle;

class ConstructTheRectangle {
    public int[] constructRectangle(int area) {
        for (int i = (int) Math.sqrt(area); i >= 1; i--) {
            if (area % i == 0) {
                return new int[] {area / i, i};
            }
        }

        return new int[] {area, 1};
    }
}