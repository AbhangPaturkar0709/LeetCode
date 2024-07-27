import java.util.*;

class Solution {
    public void decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        Character original = 'a';
        key = key.replace(" ", "");
        for (int i = 0; i < key.length(); i++) {
            if (!map.containsKey(key.charAt(i))) {
                map.put(key.charAt(i), original);
                original++;
            }
        }
        String msg = "";
        for (char ch : message.toCharArray()) {
            if (ch == ' ') {
                msg += " ";

            } else {
                msg += map.get(ch);
            }
        }
        return msg;

    }

    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog", m = "akbs bs t suepuv";
        new Solution().decodeMessage(key, m);
        Integer.parseInt("54", 6);
    }
}