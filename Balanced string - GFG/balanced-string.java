//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Position this line where user code will be pasted.
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.BalancedString(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static String BalancedString(int n) {
        // code here
        int temp = n;
        String s = "";
		String alp = "abcdefghijklmnopqrstuvwxyz";
		if(temp%2 == 0) {
		    int num = n/26;
		    for(int i = 0 ; i < num;i++)
			    s += alp;
		    n = n%26;
			for(int i = 0 ; i < n/2 ; i++)
					s += alp.charAt(i);
			for(int i = 26-n/2 ; i < 26; i++)
					s += alp.charAt(i);
		}
		else{
		    int sum = sd(temp);
		    if(sum%2 == 0)
		    {
		        int num = n/26;
		        for(int i = 0 ; i < num;i++)
			        s += alp;  
			    n = n%26;
    			for(int i = 0 ; i < (n+1)/2 ; i++)
    					s += alp.charAt(i);
    			for(int i = 26-(n-1)/2 ; i < 26; i++)
    					s += alp.charAt(i);
		    }
		    else
		    {
		        int num = n/26;
		        for(int i = 0 ; i < num;i++)
			        s += alp;  
			    n = n%26;
    			for(int i = 0 ; i < (n-1)/2 ; i++)
    					s += alp.charAt(i);
    			for(int i = 26-(n+1)/2 ; i < 26; i++)
    					s += alp.charAt(i);
		    }
		}
		return s;
    }
    public static int sd(int n) {
		int sm = 0;
		while(n!=0)
		{
			sm += n%10;
			n = n/10;
		}
		return sm;
	}
}