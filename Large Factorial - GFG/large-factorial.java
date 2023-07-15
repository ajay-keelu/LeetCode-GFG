//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[n];
            String[] str = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(str[i]);
            }

            Solution ob = new Solution();
            
            long res[] = ob.factorial(a,n);
            
            for (int i=0; i<n; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static long m = 1000000000+7;
    public long[] factorial(long a[], int n) {
        // code here
        long max = arrMax(a);
        long fact[] = new long[(int)max+1];
        fact[0] = 1;
        for(int i = 1 ; i <= (int)max ; i++ ){
            fact[i] = (fact[i-1]*i)%m;
        }
        for(int i = 0 ; i < n ; i++){
            a[i] = fact[(int)a[i]];
        }
        return a;
    }
    public static long arrMax(long[] arr){
        long max = Long.MIN_VALUE;
        for(long l:arr)
            max = max > l ? max : l;
        return max;
    }
}