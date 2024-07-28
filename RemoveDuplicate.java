
class Solution {
    String removeDups(String str) {
        // code here
        String st = "";
        for(char ch : str.toCharArray()){
            if(st.indexOf(ch) < 0){
                st+=ch;
            }
        }
        return st;
    }
}