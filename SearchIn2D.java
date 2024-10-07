class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m; i++){
            int j = 0, k = n-1;
            while(j<=k){
                if(matrix[i][j]==target){
                    return true;
                }else if(matrix[i][k] == target){
                    return true;
                }
                j++;
                k--;
            }
        }
        return false;
    }
}