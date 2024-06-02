class Solution {
    public static int[] plusOne(int[] digits) {
        int[] ans = new int[digits.length+1];
        int carry = 0;
        for(int i = digits.length-1; i >= 0; i--){
            int sum = 0;
            if(i == (digits.length-1)){
                sum += digits[i] + 1;
            }else{
                sum += digits[i] + carry;
            }
            if(sum > 9){
                ans[i+1] = 0;
                carry = 1;
            }else{
                ans[i+1] = sum;
                carry = 0; 
            }
        }
        if(carry == 1){
            ans[0] = 1;
            return ans;
        }else{
            int[] temp = new int[digits.length];
            System.arraycopy(ans, 1, temp, 0, digits.length);;
            return temp;
        }
    }

    public static void main(String[] args) {
        int digits[] = { 1, 2, 9 };
        int ar[] = plusOne(digits);
        for (int i : ar) {
            System.out.println(i);
        }
    }
}