class Solution {
    public int appendCharacters(String s, String t) {
        int sPtr = 0, tPtr = 0;

        while (sPtr < s.length() & tPtr < t.length()) {
            if (s.charAt(sPtr) == t.charAt(tPtr)) {
                tPtr++;
            }
            sPtr++;
        }

        return t.length() - tPtr;

        // for (int i = 0; i < s.length(); i++) {
        // // int innerMatchStrLen = 0;
        // for (int j = matchStrLen; j < t.length(); j++) {
        // if (s.charAt(i) == t.charAt(j)) {
        // matchStrLen++;
        // } else {
        // break;
        // }
        // }
        // // if (matchStrLen < innerMatchStrLen) {
        // // matchStrLen = innerMatchStrLen;
        // // }
        // }

        // for(int i = 0; i < s.length() & i < t.length(); i++){
        // if(s.charAt(i) == t.charAt(i)){
        // lastIndexOfMatchSubStr++;
        // }else{
        // break;
        // }
        // }

        // if (matchStrLen == -1 & s.contains(t)) {
        // return 0;
        // } else if (matchStrLen == -1) {
        // return t.length();
        // } else {
        // return (t.length() - matchStrLen);
        // }
    }
}