import java.util.*;

class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String s1 = "";
        for(String str : words){
            s1 += str.charAt(0);
        }

        if(s1.equals(s)) return true;
        return false;
    }
}