class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;

        while(start<=end){
            if(nums[start] == target && nums[end] == target){
                return new int[]{start, end};
            }else if(nums[start] < target){
                start++;
            }else if(nums[end] > target){
                end--;
            }
        }
        return new int[]{-1,-1};
        
    }
}