class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if (strs.length > 0) {
            for (int i = 0; i < strs[0].length(); i++) {
                char ch = strs[0].charAt(i);
                for (int j = 1; j < strs.length; j++) {
                    // Check if character equals or not || if length of string if greater than 'i'
                    if (ch != strs[j].charAt(i) || (i > strs[j].length())) {
                        return prefix;
                    }
                    // if(!(strs[j].length() <= i+1) && !(ch == strs[j].charAt(i))){

                    // }
                }
                prefix += ch;
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String strs[] = { "flower", "flowar", "flight" };
        System.out.println(longestCommonPrefix(strs));
    }
}