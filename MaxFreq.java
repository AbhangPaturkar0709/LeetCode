class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count[] = new int[101];
        for(int val : nums){
            count[val]++;
        }

        int freq = 0, prevHighFreq = 0;
        for(int i : count){
            if(i > prevHighFreq){
                prevHighFreq = i;
                freq = i;
                continue;
            }
            if(i == prevHighFreq){
                freq += i;
            }
        }
        return freq;
    }
}