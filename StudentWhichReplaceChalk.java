class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sumChalk = 0l;
        for(int val : chalk){
            sumChalk += val;
        }
        // while(sumChalk <= k){
            k = (int)(k % sumChalk);
        // }

        // if(k == 0) return 0;

        for(int i = 0; i < chalk.length; i++){
            if(chalk[i] > k){
                return i;
            }else{
                k -= chalk[i];
            }
        }
        return 0;
    }
}