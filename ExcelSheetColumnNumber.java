class Solution {
    public static int titleToNumber(String columnTitle) {
        int num = 0;
        for(int i = columnTitle.length()-1; i >=0; i--){
            num += Math.pow(26, (columnTitle.length()-(i+1))) * (columnTitle.charAt(i) - 64); 
        }
        return num;
    }

    public static void main(String[] args) {
        String a = "AB";
        System.err.println(titleToNumber(a));
    }
}