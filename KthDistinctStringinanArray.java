import java.util.*;

class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> hm = new HashMap<>();
        int n = arr.length;

        for(String v : arr){
            hm.put(v,hm.getOrDefault(v, 0)+1);
        }
        for(String v : arr){
            if(hm.get(v) == 1){
                --k;
            }
            if(k == 0){
                return v;
            }
        }
        return "";
    }
}
class Solution:
    def kthDistinct(self, arr: list[str], k: int) -> str: