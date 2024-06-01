class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length], rightSum = new int[nums.length], answer = new int[nums.length];

        for(int i = 1, j = rightSum.length-2; i < leftSum.length && j >= 0; i++, j--){
            leftSum[i] = leftSum[i-1] + nums[i-1];
            rightSum[j] = rightSum[j+1] + nums[j+1];
        }

        for(int i = 0; i < nums.length; i++){
            answer[i] = Math.abs(leftSum[i]-rightSum[i]);
        }
        return answer;
    }
}