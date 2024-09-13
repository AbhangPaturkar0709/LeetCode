class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int arrSize = arr.length;

        for(int i = 1; i < arrSize; i++){
            arr[i] = arr[i] ^ arr[i-1];
        }
        arrSize = queries.length;
        int[] ans = new int[arrSize];

        for(int i = 0; i < arrSize; i++){
            // int left = queries[i][0];
            // int right = ;
            if(queries[i][0] == 0){
                ans[i] = arr[queries[i][1]];
            }else{
                ans[i] = arr[queries[i][0]-1] ^ arr[queries[i][1]];
            }
        }
        return ans;
    }
}