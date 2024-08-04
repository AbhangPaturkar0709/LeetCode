class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int arrSize = (n * (n+1))/2;
        int[] arr = new int[arrSize];
        long tmp = 0l;

        for(int i = 0, j = 0; i < (n-1) || j < arrSize; i++, j++){
            tmp = nums[i];
            arr[j] = (int)tmp;
            for(int k = i+1; k < n; k++){
                j++;
                tmp += nums[k];
                arr[j] = (int)tmp;
            }
        }

        tmp = 0l;
        Arrays.sort(arr);
        for(int i = left-1; i < right; i++){
            tmp += arr[i];
        }
        return (int)(tmp%(1e9 + 7));
        
    }
}