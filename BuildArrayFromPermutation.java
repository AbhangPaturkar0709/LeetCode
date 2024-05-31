class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans;
        if (nums.length > 0) {
            ans = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                ans[i] = nums[nums[i]];
            }
            return ans;
        } else {
            return new int[0];
        }
    }
}