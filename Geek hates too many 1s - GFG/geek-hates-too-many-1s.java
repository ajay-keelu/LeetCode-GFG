//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.noConseBits(n);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int noConseBits(int n) {
        // code here
        if(n <= 6)
            return n;
        String str = Integer.toBinaryString(n);
        char[] s = str.toCharArray();
        int c = 0;
        for(int i = 0 ; i < s.length ; i++ ){
            if(s[i] == '1')
                c++;
            if(c == 3){
                s[i] = '0';
            }
            if(s[i] == '0')
                c = 0;
        }
        str = "";
        for(char ch : s)
            str += ch;
        return Integer.parseInt(str,2);
    }
}
        
