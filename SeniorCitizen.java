class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(String detail : details){
            
            if(Integer.valueOf(detail.charAt(11))>60){
                count++;
            }
        }
        return count;
    }
}