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
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
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
        int a=0,b=0,c=0;
        Node temp = head;
        while(temp != null)
        {
            int k = temp.data;
            if(k == 0)
                a++;
            else if(k==1)
                b++;
            else
                c++;
            temp = temp.next;
        }
        List<Integer>li = new ArrayList<>();
        while(true)
        {
            if(a==0 && b==0 && c==0)
                break;
            if(a!=0)
            {
                li.add(0);
                a--;
            }
            else if(b!=0)
            {
                li.add(1);
                b--;
            }
            else{
                li.add(2);
                c--;
            }
        }
        Node root = null;
         temp = null;
        for(int i = 0 ; i < li.size() ; i++)
        {
            if(i == 0)
                root = temp = new Node(li.get(i));
            else
            {
                temp.next = new Node(li.get(i));
                temp = temp.next;
            }
        }
        return root;
    }
}


