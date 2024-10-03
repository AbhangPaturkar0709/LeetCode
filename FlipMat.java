class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= n-j-1; j++){
                int tmp = image[i][j];
                image[i][j] = 1 ^ (image[i][n-j-1]);
                image[i][n-j-1] = 1 ^ (tmp);
            }
        }

        return image;
    }
}