import java.util.*;
class Solution {
    public int minimumPushes(String word) {
        int[] countAr = new int[26];
        for(char ch : word.toCharArray()){
            countAr[ch - 'a']++; 
        }
        Arrays.sort(countAr);
        int res = 0;
        for(int i = 0; i < 26; i++){
            res += (i/8+1) * countAr[26-i-1];
        }
        return res;
        
    }
}