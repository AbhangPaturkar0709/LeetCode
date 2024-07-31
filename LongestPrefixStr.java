//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        String pfx = "";
        Arrays.sort(arr);
        
        outer:
        for(int i = 0; i < arr[0].length(); i++){
            char ch = arr[0].charAt(i);
            for(int j = 1; j < arr.length; j++){
                if(ch != arr[j].charAt(i)){
                    break outer;
                }
            }
            pfx += ch;
        }
        if(pfx.length()>0){
            return pfx;
        }else{
            return "-1";
        }
        
    }
}