class Solution {

    public boolean isValid(String str) {
        // Write your code here
        String[] arr = str.split(".");
        for(String val:arr){
            int v = Integer.parseInt(val, 10);
            if(!(v >= 0 && v < 256)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Solution obj = new Solution();
    }
    
}