//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(arr);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class numComperator implements Comparator<String>{
     @Override
    public int compare(String a,String b){
        return -(a+b).compareTo(b+a);
    }
}
class Solution {
    String printLargest(String[] arr) {
        List<String>li = new ArrayList<>();
        for(String s : arr)
            li.add(s);
        Collections.sort(li,new numComperator());
        String res = "";
        for(String s:li)
            res += s;
        return res;
    }
}
