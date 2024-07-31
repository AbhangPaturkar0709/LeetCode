class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }
        n = (n * (n+1))/2;
        return (n - sum);
    }
}