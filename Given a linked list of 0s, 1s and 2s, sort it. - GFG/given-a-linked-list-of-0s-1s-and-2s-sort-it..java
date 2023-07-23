//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n =Integer.parseInt(in.readLine().trim());
            String s[] = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(s[i]));
                tail = tail.next;
            }

            head = new Solution().segregate(head);
            printList(head, out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node head,PrintWriter out)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}




// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        Node zero = null;
        Node one = null;
        Node two = null;
        Node temp0 = null;
        Node temp1 = null;
        Node temp2 = null;
        while(head != null){
            if(head.data == 0){
                if(zero == null)
                    zero = temp0 = new Node(head.data);
                else{
                    temp0.next = new Node(head.data);
                    temp0 = temp0.next;
                }
            }else if(head.data == 1){
                if(one == null)
                    one = temp1 = new Node(head.data);
                else{
                    temp1.next = new Node(head.data);
                    temp1 = temp1.next;
                }
            }else{
                if(two == null)
                    two = temp2 = new Node(head.data);
                else{
                    temp2.next = new Node(head.data);
                    temp2 = temp2.next;
                }
            }
            head = head.next;
        }
        if(zero == null){
            if(one == null)
                zero = two;
            else{
                temp1.next = two;
                zero = one;
            }
        }else{
            if(one == null){
                temp0.next = two;
            }else{
                temp1.next = two;
                temp0.next = one;
            }
        }
        return zero;
    }
}


