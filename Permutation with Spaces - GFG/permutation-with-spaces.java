//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine().trim();
            Solution ob = new Solution();
            ArrayList<String> ans = new ArrayList<String>();
            ans = ob.permutation(S);
            
            for(int i=0;i<ans.size();i++){
                System.out.print("("+ans.get(i)+")");
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java



class Solution{
    
    ArrayList<String> permutation(String S){
       ArrayList<String> res = new ArrayList<>();
       prem(res,"",S,0,S.length());
       return res;
    }
    static void prem(ArrayList<String> res,String r,String s,int i,int n){
        if(i == n){
            if(r.length() <= n*2-1 )//&& r.charAt(r.length() - 1) != ' ')
                res.add(r);
            return ;
        }
        if(i != n-1)
            prem(res,r+s.charAt(i)+" ",s,i+1,n);
        prem(res,r+s.charAt(i),s,i+1,n);
    }
}