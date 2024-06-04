class Solution {
    public int longestPalindrome(String s) {
        int set[] = new int[125], res = 0, oddCount = 0;
        for(char ch : s.toCharArray()){
            if(set[ch] == 1){
                set[ch] = 0;
                res += 2;
            }else{
                set[ch] = 1;
                oddCount++;
            }
        }

        if(oddCount>0){
            res++;
        }

        return res;
    }
}