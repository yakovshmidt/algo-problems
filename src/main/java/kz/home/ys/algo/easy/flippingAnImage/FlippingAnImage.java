package kz.home.ys.algo.easy.flippingAnImage;

class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int row = 0; row < image.length; row++) {
            int l = 0;
            int r = image[row].length - 1;
            while (l <= r) {
                int temp = image[row][l] ^ 1;
                image[row][l] = image[row][r] ^ 1;
                image[row][r] = temp;
                l++;
                r--;
            }
        } 
        return image;
    }
}