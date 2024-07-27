class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] decode = new int[n+1];
        decode[0] = first;
        for(int i = 0; i < n; i++){
            decode[i+1] = decode[i] ^ encoded[0];
        }
        return decode;
    }
}