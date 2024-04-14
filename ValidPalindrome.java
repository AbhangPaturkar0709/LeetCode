class Solution {
    public static boolean isPalindrome(String s) {
        boolean valid = false;

        String rev = "", temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter((Character) s.charAt(i))) {
                rev = s.charAt(i) + rev;
                temp += s.charAt(i);

            }
        }
        if (temp.equalsIgnoreCase(rev)) {
            valid = true;
        }

        return valid;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("    "));
        System.out.println(isPalindrome("samir"));
        System.out.println(isPalindrome("naMan"));
    }
}