class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()){
            return -1;
        }else{
            for(int i=0; i<needle.length(); i++){
                char ch = needle.charAt(i);
                for(int j = 0; j<haystack.length(); j++){
                    if(!(ch == haystack.charAt(j) && haystack.length() <= (needle.length()-i))){
                        
                    }
                }
            }
        }
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String a = "abhang", b = "an";
        a.indexOf(b);
    }
}