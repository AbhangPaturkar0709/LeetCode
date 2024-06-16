import java.util.*;

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> str = new ArrayList<>();
        for (String word : words) {
            String[] s = word.split(separator + "");
            for (String t : s) {
                str.add(t);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.splitWordsBySeparator(new, 0)
    }
}