//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        // code here
        int n = str.length();
        int lcs[][] = new int[n+1][n+1];
        for(int i = 0 ; i < n ; i++)
            lcs[i][0] = 0;
        for(int i = 0 ; i < n ; i++)
            lcs[0][i] = 0;
        for(int i = 1 ; i <= n ; i++ )
        {
            for(int j = 1 ; j <= n ; j++)
            {
                if(str.charAt(i-1) == str.charAt(j-1) && i != j)
                    lcs[i][j] = 1 + lcs[i-1][j-1];
                else
                    lcs[i][j] = Math.max(lcs[i-1][j],lcs[i][j-1]);
            }
        }
        return lcs[n][n];
    }
}