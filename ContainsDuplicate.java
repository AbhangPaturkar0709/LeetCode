class Solution {
    public boolean containsDuplicate(int[] nums) {
        var map = new HashMap<Integer, Integer>();
        for(int i : nums){
            if(map.get(i) == null){
                map.put(i, 1);
            }else{
                return true;
            }
        }
        return false;
    }
}