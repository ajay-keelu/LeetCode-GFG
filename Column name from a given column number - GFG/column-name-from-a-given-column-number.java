//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*; 
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
    		System.out.println (new Solution().colName (n));
        }
        
    }
}

// Contributed By: Pranay Bansal 

// } Driver Code Ends


//User function Template for Java

class Solution
{
    String colName (long n)
    {
        String res = "";
        while(n != 0){
            if(n%26 == 0){
                res = 'Z' + res;
                n = n/26 - 1;
            }
            else{
                res = ((char)('A'+(n%26 - 1))) + res;
                n = n/26;
            }
        }
        return res;
    }
}