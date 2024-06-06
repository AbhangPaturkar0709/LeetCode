import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if((n % groupSize) != 0){
            return false;
        }
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < n; i++){
            map.put(hand[i], map.getOrDefault(hand[i], 0)+1);
        }

        while(map.size()>0){
            int curCard = map.entrySet().iterator().next().getKey();
            for(int i = 0; i < groupSize; i++){
                int card = curCard+i;
                if(!map.containsKey(card)) return false;
                map.put(card, map.get(card)-1);
                if(map.get(card) == 0){
                    map.remove(card);
                }
            }
        }

        return true;
    }
}