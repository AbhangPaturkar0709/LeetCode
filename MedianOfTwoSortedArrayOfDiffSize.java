//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        int[] merge = new int[n + m];
        System.arraycopy(a, 0, merge, 0, n);
        System.arraycopy(b, 0, merge, n, m);
        Arrays.sort(merge);
        int l = merge.length;
        double mid = 0;
        if (l % 2 != 0) {
            mid = merge[l / 2];
        } else {
            mid = (merge[l / 2 - 1] + merge[l / 2]) / 2.0;
        }
        return mid;
    }
}