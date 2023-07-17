//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long pre = 1,suf = 1,cur = Long.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(pre == 0)
                pre = 1;
            if(suf == 0)
                suf = 1;
            pre = pre*arr[i];
            
            suf = suf*arr[n-i-1];
            
            cur = Math.max(cur,Math.max(pre,suf));
        }
        return cur;
    }
}