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
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        Map<Integer,Integer>mp = new HashMap<>();
        for(int i:nums)
            mp.put(i,mp.getOrDefault(i,0)+1);
        int c = 0;
        for(int i:nums)
            if(mp.get(i) == 1)
                c++;
        int res[] = new int[c];
        c = 0;
        for(int i:nums)
            if(mp.get(i) == 1)
                res[c++] = i;
        Arrays.sort(res);
        return res;
    }
}