class Solution {
    public void sortColors(int[] nums) {
        int[] countArr = new int[3];
        for(int i : nums){
            countArr[i]++;
        }

        int k = 0;
        for(int i = 0; i < countArr.length; i++){
            for(int j = 0; j < countArr[i]; j++){
                nums[k] = i;
                k++;
            }
        }
    }
}