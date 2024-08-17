class Solution {
    public int myAtoi(String s) {
        long ans = 0l;
        int sign = 1;
        int i = 0; 
        s = s.trim();
        int n = s.length();
        if(n == 0){
            return 0;
        }
        if(s.charAt(0) == '-'){
            sign = -1;
            ++i;
        }else if(s.charAt(0) == '+'){
            ++i;
        }
        while(i < n && Character.isDigit(s.charAt(i))){
            // char ch = s.charAt(i);
            // // if(ch == '+'){
            // //     ++i;
            // //     continue;
            // // }
            // if(Character.isDigit(ch)){
            //     int ascii = ch - '0';
            //     res = res * 10 + ascii;
            //     res %= Long.MAX_VALUE;
            // }else{
            //     break;
            // }
            // i++;

            ans = ans * 10 + (s.charAt(i) - '0');
            if (ans * sign <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if (ans * sign >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        }
        // if(isNeg && res*-1 <= Integer.MIN_VALUE){
        //     return Integer.MIN_VALUE; 
        // }else if((!isNeg) && res >= Integer.MAX_VALUE){
        //     return Integer.MAX_VALUE;
        // }else{
        //     if(isNeg){
        //         return (int)(res*-1);
        //     }else{
        //         return (int)res;
        //     }
        //     // return (int)((isNeg) ? (res * -1) : res);
            // return (int)res;
            return (int)ans * sign;
        // }
        
    }
}
