//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        Node list1 = reverse(first);
        Node list2 = reverse(second);
        int c = 0;
        Node root = null;
        Node temp = null;
        while(list1 != null && list2 !=null){
            int sum = c + list1.data + list2.data;
            c = sum/10;
            sum %= 10;
            if(root == null)
                root = temp = new Node(sum);
            else{
                temp.next = new Node(sum);
                temp = temp.next;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        while(list1 !=null){
            int sum = c + list1.data;
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
        while(list2 != null){
            int sum = c + list2.data;
            c = sum/10;
            sum %= 10;
            if(root == null)
                root = temp = new Node(sum);
            else{
                temp.next = new Node(sum);
                temp = temp.next;
            }
            list2 = list2.next;
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