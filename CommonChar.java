import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> commonChar = new ArrayList<>();

        for(char ch = 'a'; ch <= 'z'; ch++){
            int minCount = Integer.MAX_VALUE;

            for(String word : words){
                int count = 0;
                for(char c : word.toCharArray()){
                    if(c == ch){
                        count++;
                    }
                }

                minCount = Math.min(minCount, count);
            }

            for(int i = 0; i < minCount; i++){
                commonChar.add(ch+"");
            }
        }

        return commonChar;
    }
}