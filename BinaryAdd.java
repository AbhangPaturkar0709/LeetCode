class Solution {
    public static String addBinary(String a, String b) {
        String res = "";
        if (a.length() > 0 && b.length() > 0) {
            if (a.length() < b.length()) {
                int len = b.length() - a.length();
                for (int i = 0; i < len; i++) {
                    a = "0" + a;
                }
            } else if (a.length() > b.length()) {
                int len = a.length() - b.length();
                for (int i = 0; i < len; i++) {
                    b = "0" + b;
                }
            }
            System.out.println(a + " " + b);
            int carry = 0;

            for (int i = a.length() - 1; i > -1; i--) {
                if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                    res = (0 + carry) + res;
                    carry = 0;
                    System.out.println(res + "hi1");
                } else if ((a.charAt(i) == '0' && b.charAt(i) == '1') || (a.charAt(i) == '1' && b.charAt(i) == '0')) {
                    if (carry == 0) {
                        res = 1 + res;
                        System.out.println(res + "hi2.1");
                    } else if (carry == 1) {
                        res = 0 + res;
                        carry = 1;
                        System.out.println(res + "hi2.2");
                    }
                } else if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                    if (carry == 0) {
                        res = 0 + res;
                        carry = 1;
                        System.out.println(res + "hi3.1");
                    } else if (carry == 1) {
                        res = 1 + res;
                        carry = 1;
                        System.out.println(res + "hi3.2");
                    }
                }
            }
            if (carry == 1) {
                res = 1 + res;
                System.out.println(res + "hi4");
            }
            return res;
        } else {
            if (a.length() > 0) {
                res = a;
            } else if (b.length() > 0) {
                res = b;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
}