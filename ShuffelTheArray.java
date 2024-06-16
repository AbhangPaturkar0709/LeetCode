//In progress

class Solution {
    public int[] shuffle(int[] nums, int n) {
        if (nums.length > 0) {
            int[] arr = new int[nums.length];
            for (int i = 0, j = n; i < nums.length; i += 2, j++) {
                arr[i] = nums[i];
                arr[i + 1] = nums[j];
            }
            return arr;
        } else {
            return new int[0];
        }
    }
}