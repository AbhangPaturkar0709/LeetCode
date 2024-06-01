class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        if (nums.length > 0) {
            int[] count = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] < nums[i]) {
                        count[i]++;
                    }
                }
            }

            return count;
        } else {
            return new int[0];
        }
    }
}