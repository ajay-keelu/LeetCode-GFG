//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            ArrayList<Long> ans = new Solution().nthRowOfPascalTriangle(n);
            printAns(ans);
        }
    }
    public static void printAns(ArrayList<Long> ans) {
        for (Long x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        List<ArrayList<Long>>li = new ArrayList<>();
        long m =(long)( Math.pow(10,9) + 7 );
		for(int i = 1 ; i <=n ; i++) {
			ArrayList<Long>arr = new ArrayList<>();
			if(i > 2) {
				for(int j = 0 ; j < i ;j++) {
					if(j==0 || j==i-1)
						arr.add((long)1);
					else {
						ArrayList<Long>t = li.get(i-2);
						arr.add((long)(t.get(j)+t.get(j-1))%m) ;
					}
				}
			}else {
				arr.add((long)1);
				if(i-1>0)
				arr.add((long)1);
			}
			li.add(arr);
		}
        return li.get(n-1);
    }
}