class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int i = 0, j = mat.length-1;
        int n = j;
        while(i<=n){
            if(i == j){
                sum += mat[i][i];
            }else{
                sum += mat[i][i];
                sum += mat[i][j];
            } 
            i++;
            j--;
        }
        return sum;
    }
}