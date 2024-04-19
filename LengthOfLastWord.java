class Solution {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int lenLastWord = 0;
        if (s.length() > 0) {
            for (int i = s.length() - 1; i >= 0; i--) {
                if (Character.isWhitespace(s.charAt(i))) {
                    break;
                }
                lenLastWord++;
            }
        }
        return lenLastWord;
    }
}