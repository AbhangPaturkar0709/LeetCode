import java.util.*;

class Solution {
    public void countPairs(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(13);
        Solution obj = new Solution();
        obj.countPairs(a);
    }
}