
class Solution {
    public boolean halvesAreAlike(String s) {
        int len = s.length();
        String[] words = new String[]{s.substring(0, len/2), s.substring(len/2, len)};

        int c1 = 0, c2 = 0;
        for(int i = 0; i < words[0].length(); i++){
            if("aeiouAEIOU".indexOf(words[0].charAt(i)) >= 0){
                c1++;
            }
            if("aeiouAEIOU".indexOf(words[01].charAt(i)) >= 0){
                c2++;
            }
        }
        return c1 == c2;
    }
}