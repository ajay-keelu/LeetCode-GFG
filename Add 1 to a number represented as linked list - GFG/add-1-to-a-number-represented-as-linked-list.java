//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node addOne(Node head) 
    {
        Node list1 = reverse(head);
        int c = 0;
        boolean f = true;
        Node root = null;
        Node temp = null;
        while(list1 != null){
            int sum = c + list1.data;
            if(f){
                sum += 1;
                f = false;
            }
            c = sum/10;
            sum %= 10;
            if(root == null)
                root = temp = new Node(sum);
            else{
                temp.next = new Node(sum);
                temp = temp.next;
            }
            list1 = list1.next;
        }
        while(c != 0){
            int sum = c;
            c = sum/10;
            sum %= 10;
            if(root == null)
                root = temp = new Node(sum);
            else{
                temp.next = new Node(sum);
                temp = temp.next;
            }
        }
        root = reverse(root);
        return root;
    }
    public static Node reverse(Node root){
        Node head = null;
        while(root != null){
            Node temp = new Node(root.data);
            if(head == null)
                head = temp;
            else{
                temp.next = head;
                head = temp;
            }
            root = root.next;
        }
        return head;
    }
}
