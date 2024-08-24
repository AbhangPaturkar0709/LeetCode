class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int count = 0;
        while(start <= end){
            if(nums[start] == val){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                end--;
                count++;
            }else{
                start++;
            }
        }
        return n-count;
    }
}