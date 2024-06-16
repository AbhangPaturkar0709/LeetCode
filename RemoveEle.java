class Solution {
    public int[] swap(int []nums, int ind){
        for(int i = ind; i < nums.length-1;i++){
            nums[i] = nums[i+1];
        }
        return nums;
    }
    public int removeElement(int[] nums, int val) {
        if(nums.length > 0){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == val){
                    nums = swap(nums, i);
                    break;
                }
            }
            return nums.length;
        }else{
            return 0;
        }
    }
}