//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            boolean ans = new Solution().checkTriplet(arr, n);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    boolean checkTriplet(int[] arr, int n) {
        for(int i = 0 ; i < n ; i++)
            arr[i] = arr[i]*arr[i];
        Map<Integer,Integer>mp = new HashMap<>();
        for(int i:arr)
            mp.put(i,mp.getOrDefault(i,0)+1);
        for(int i = 0  ; i < n ; i++){
            for(int j = 0; j < n ; j++){
                if(i != 0 && mp.containsKey(arr[i]+arr[j]))
                    return true;
            }
        }
        return false;
    }
}