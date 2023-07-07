//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java
class Node{
    int val;
    Node next = null;
    Node(int val){
        this.val = val;
    }
}
class Solution{
    static int find(int n){
        // code here
        Node root = null;
        Node temp = null;
        for(int i = 1 ; i <= n ; i++){
            if(root == null)
                root = temp = new Node(i);
            else{
                temp.next = new Node(i);
                temp = temp.next;
                if(i == n){
                    temp.next = root;
                }
            }
        }
        Node res = root;
        while(true){
            if(res.next.val == res.val)
                break;
            res.next = res.next.next;
            res = res.next;
        }
        return res.val;
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
           
            Solution ob = new Solution();
            System.out.println(ob.find(N));
        }
    }
}
// } Driver Code Ends