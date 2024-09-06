class Solution {
    public int addDigits(int num) {
        // int sum = num;
        while(num >= 10){
            int sum = 0;
            while(num > 0){
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}