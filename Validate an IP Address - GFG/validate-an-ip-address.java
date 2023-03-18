//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String s) {
        if(s.length() > 15)
            return false;
        /*
        int ct = 0;
        int temp = 0;
        int z = 0;
        int dc = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c != '.'){
                temp = temp*10 + (c - '0');
                if(temp == 0 && c == '0')
                    z++;
                if(dc > 1)
                    return false;
                dc = 0;
            }
            else{
                dc++;
                ct++;
                if(z > 1)
                    return false;
                if(temp < 0 || temp > 255)
                    return false;    
                temp = 0;
                z = 0;
            }
        }
        if(ct != 3)
            return false;
        if(dc > 1)
            return false;
        return true;*/
        List<String>str = new ArrayList<>();
        String temp = "";
        int dc = 0;
        for(char c : s.toCharArray()){
            if(c == '.'){
                str.add(temp);
                temp = "";
                dc++;
            }else{
                temp += c;
            }
            if(c < '0' || c > '9' ){
                if(c != '.')
                    return false;
            }
        }
        if(dc > 3)
            return false;
        if(temp.compareTo("") != 0)
            str.add(temp);
        //System.out.println(str);
        if(str.size() != 4){
            return false;
        }
        for(String t : str){
            if(t.length() > 3){
                return false;
            }
            if(t.length()>1 && t.charAt(0) == '0'){
                return false;
            }
            if(t.length() == 0){
                return false;
            }
            int n = Integer.parseInt(t);
            if( n < 0 || n > 255){
                return false;
            }
        }
        return true;
    }
}