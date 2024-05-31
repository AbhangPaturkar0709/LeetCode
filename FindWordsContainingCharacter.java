import java.util.*;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ind = new ArrayList<>();
        if(words.length > 0){
            for(int i = 0; i<words.length; i++){
                char[] word = words[i].toCharArray();
                boolean flag = false;
                for(char ch: word){
                    if(ch == x){
                        flag = true;
                        break;
                    }
                }
                if(flag == true){
                    ind.add(i);
                }
            }
        }
        return ind;
    }
}