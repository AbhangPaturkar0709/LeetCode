class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for(String s: sentences){
            if(maxCount < s.split(" ").length){
                maxCount = s.split(" ").length;
            }
        }
        return maxCount;
    }
}