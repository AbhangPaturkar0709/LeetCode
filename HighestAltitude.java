class Solution {
    public int largestAltitude(int[] gain) {
        int highAltitude = 0;

        for(int i = 0; i < gain.length; i++){
            int altitude = (i == 0) ? gain[i] : gain[i] + gain[i-1];
            gain[i] = altitude;
            if(highAltitude < gain[i]){
                highAltitude = gain[i];
            }
        }
        return highAltitude;
        // return (highAltitude < 0) ? 0:highAltitude;
    }
}