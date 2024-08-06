class Solution {
    public int minimumPushes(String word) {
        int ar[] = new int[8], i = 0, n = ar.length;
        int result = 0;

        for(char ch:word.toCharArray()){
            if(i > 7){
                i = 0;
            }
            ar[i]++;
            result += ar[i];
            i++;
        }
        return result;
        
    }
}