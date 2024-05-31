import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            int totalCandy = candies[i] + extraCandies;
            boolean extraCandy = true;
            for(int j = 0; j < candies.length; j++){
                if(totalCandy<candies[j]){
                    extraCandy = false;
                    break;
                }
            }
            result.add(extraCandy);
        }
        return result;
    }
}