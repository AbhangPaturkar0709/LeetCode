//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String s = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.reverseString(s));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String reverseString(String s)
    {
        //code here.
        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        int n = s.length();
        
        for(int i = n-1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                hs.add(s.charAt(i));
            }
        }
        
        StringBuffer sb = new StringBuffer("");
        for(char ch : hs){
            sb.append(ch);
        }
        return sb.toString();
    }
}