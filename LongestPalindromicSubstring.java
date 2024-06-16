class Solution {
    // "abccccdd"
    public int longestPalindrome(String s) {
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandMiddle(s, i, i);
            int len2 = expandMiddle(s, i, i + 1);
            maxLen = Math.max(maxLen, Math.max(len1, len2));
        }
        return maxLen;
    }

    private int expandMiddle(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }

    public static void main(String[] args) {

        System.out.println(new Solution().longestPalindrome("abccccdd"));
    }
}
