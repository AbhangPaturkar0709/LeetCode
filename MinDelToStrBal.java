class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        int aCount[] = new int[n];
        int bCount[] = new int[n];

        for(int i = 1; i < n; i++){
            bCount[i] = bCount[i-1];
            if(s.charAt(i-1) == 'b'){
                bCount[i]++;
            }
        }

        for(int i = n-2; i >= 0; i--){
            aCount[i] = aCount[i+1];
            if(s.charAt(i+1) == 'a'){
                aCount[i]++;
            }
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int tmp = aCount[i] + bCount[i];
            if(min > tmp){
                min = tmp;
            }
            // min = Math.min(min, (aCount[i] + bCount[i]));
        }
        return min;
    }
}