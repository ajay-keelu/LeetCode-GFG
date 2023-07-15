//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class duplicates
{
    Node head;  
    Node tail;
	public void addToTheLast(Node node) 
	{
	  if (head == null) 
	  {
	   head = node;
	   tail = node;
	  } 
	  else 
	  {
	   tail.next = node;
	   tail = node;
	  }
	}
      void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	/* Drier program to test above functions */
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
         {
			int N = sc.nextInt();
			duplicates llist = new duplicates(); 
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < N; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
			
        Solution ob = new Solution();
		head = ob.removeAllDuplicates(llist.head);
		llist.printList(head);
		
        t--;		
        }
    }
    
}
// } Driver Code Ends


//User function Template for Java

/* Linked List Node class

class Node
{
    int data;
    Node next;
}
    
*/

class Solution
{
    public static Node removeAllDuplicates(Node head)
    {
        Node temp = null;
        Map<Integer,Integer>mp = new HashMap<>();
        List<Integer>li = new ArrayList<>();
        while(head != null){
            int val = head.data;
            mp.put(val,mp.getOrDefault(val,0)+1);
            if(li.size() == 0)
                li.add(val);
            else{
                if(li.size() > 0 && li.get(li.size()-1) != val)
                    li.add(val);
            }
            head = head.next;
        }
        for(Integer i:li){
            if(mp.get(i) == 1){
                if(head == null)
                    head = temp = new Node(i);
                else{
                    temp.next = new Node(i);
                    temp = temp.next;
                }
            }
        }
        return head;
    }
}