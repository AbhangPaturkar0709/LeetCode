class Solution {
    public int getLucky(String s, int k) {
        String sb = new String("");
        for(char ch : s.toCharArray()){
            sb += ch-96;
        }
        int sum = 0;
        while(k > 0){
            sum = 0;
            for(char ch : sb.toCharArray()){
                sum += ch - 48;
            }
            sb = String.valueOf(sum);
            k--;
        }
        return sum;
    }
}