//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String x = read.readLine();
            String y = read.readLine();
            Solution ob = new Solution();
            String result = ob.findSum(x, y);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String findSum(String x, String y) {
        // code here
        
        int c = 0;
        String res = "";
        int i = x.length()-1;
        int j = y.length()-1;
        while(i>=0 && j>=0){
            int sum = c + (x.charAt(i)-'0') + (y.charAt(j) - '0');
            int r = sum%10;
            res = (char)('0'+r) + res;
            c = sum/10;
            i--;
            j--;
        }
        while(j >= 0){
            int sum = c + (y.charAt(j)-'0');
            res = (char)('0'+sum%10) + res;
            c = sum/10;
            j--;
        }
        while(i >= 0){
            int sum = c + (x.charAt(i)-'0');
            res = (char)('0'+sum%10) + res;
            c = sum/10;
            i--;
        }
        while(c!=0){
            res = (char)('0'+c%10) + res;
            c = c/10;
        }
        i = 0;
        while(i < res.length()){
            if(res.charAt(i) != '0')
                break;
            i++;
        }
        String r = "";
        for( j = i ; j < res.length() ; j++)
            r += res.charAt(j);
        if(r.length() == 0)
            return "0";
        return r;
    }
}