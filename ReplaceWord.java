import java.util.*;

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] sen = sentence.split(" ");
        for (String s : dictionary) {
            for (int i = 0; i < sen.length; i++) {
                if (sen[i].startsWith(s)) {
                    sen[i] = s;
                }
            }
        }

        return String.join(" ", sen);
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        List<String> ss = new ArrayList<>();
        ss.add("cat");
        ss.add("bat");
        ss.add("rat");

        obj.replaceWords(ss, "the cattle was rattled by the battery");
    }
}