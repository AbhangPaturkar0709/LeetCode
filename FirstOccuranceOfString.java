// 28. Find the Index of the First Occurrence in a String

// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

// Example 1:

// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.
// Example 2:

// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.

// Constraints:

// 1 <= haystack.length, needle.length <= 104
// haystack and needle consist of only lowercase English characters.

class Solution {
    public static int strStr(String haystack, String needle) {
        int ind = -1;
        if (haystack.length() < needle.length()) {
            return ind;
        } else {
            for (int i = 0; i < needle.length(); i++) {
                char ch = needle.charAt(i);
                for (int j = 0; j < haystack.length(); j++) {
                    if (!(ch == haystack.charAt(j) && needle.length() <= (haystack.length()-i))) {
                        
                    }
                }
            }
        }
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String a = "abhang", b = "an";
        System.out.println(strStr(a, b));
        System.out.println(strStr(b, a));
        // System.out.println(b.indexOf(a));
    }
}