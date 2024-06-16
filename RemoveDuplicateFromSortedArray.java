class Solution {
    public static int removeDuplicates(int[] nums) {
        int unqNums[] = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < count + 1; j++) {
                if (unqNums[j] == nums[i]) {
                    isUnique = false;
                }
            }
            if (isUnique == true) {
                unqNums[count + 1] = nums[i];
                count++;
            }
        }
        return count;
    }

    


    public static void main(String[] args) {
        int num[] = {1,1,2};
        System.out.println(removeDuplicates(num));
    }
}