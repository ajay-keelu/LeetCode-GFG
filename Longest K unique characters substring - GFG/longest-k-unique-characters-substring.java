//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        Map<Character,Integer>mp = new HashMap<>();
        int n = s.length();
        int i = 0, j = 0;
        boolean f = false;
        int max = 0;
        while(j < n){
            if(mp.size() <= k){
                mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
                if(mp.size() == k){
                    f = true;
                    max = Math.max(max,j-i+1);
                }
                j++;
            }else{
                mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                if(mp.get(s.charAt(i)) == 0)
                    mp.remove(s.charAt(i));
                i++;
            }
        }
        if(f)
            return max;
        return -1;
    }
}