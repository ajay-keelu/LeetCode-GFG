//{ Driver Code Starts
import java.util.*;
import java.lang.*;

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

class ReverseInSize
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail =tail.next;
            }
            
            int k = sc.nextInt();
            Solution ob = new Solution();
            Node res = ob.reverse(head, k);
            printList(res);
            System.out.println();
        }
    }
    
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
}


// } Driver Code Ends


/*node class of the linked list

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

*/

class Solution
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        List<Integer>li = elements(node);
        Node temp = node;
        int l = 0;
        while(temp != null)
        {
            l++;
            temp = temp.next;
        }
        for(int i = 0 ; i+k <= l ;) {
            Collections.reverse(li.subList(i,i+k));
            i = i + k;
        }
        if(l%k !=0 )
        	Collections.reverse(li.subList(l-l%k, l));
        Node root = null;
        temp = null;
        for(int i = 0 ; i < l ; i++)
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
    public static List<Integer> elements(Node root){
        List<Integer>li = new ArrayList<>();
        while(root != null)
        {
            li.add(root.data);
            root = root.next;
        }
        return li;
    }
}

