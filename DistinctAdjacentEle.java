//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    if(ob.distinctAdjacentElement(arr,n))
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public boolean distinctAdjacentElement(int arr[] , int n)
    {
        //code here.
        Map<Integer, Integer> m = new HashMap<>();
        for(int val : arr){
            m.put(val, m.getOrDefault(val, 0)+1);
        }
        // Set<Integer> s = m.entrySet();
        int max = -1;
        for(int val : m.values()){
            if(max < val){
                max = val;
            }
        }
        return (n+1)/2 >= max;
    }
}