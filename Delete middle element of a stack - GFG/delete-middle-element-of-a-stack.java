//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0)
        {
            int sizeOfStack =sc.nextInt();
            Stack <Integer> myStack=new Stack<>();
            
            //adding elements to the stack
            for(int i=0;i<sizeOfStack;i++)
            {
                int x=sc.nextInt();
                myStack.push(x);
                
            }
                Solution obj=new Solution();
                obj.deleteMid(myStack,sizeOfStack);
                
                while(!myStack.isEmpty())
                {
                    System.out.print(myStack.peek()+" ");
                    myStack.pop();
                }
                System.out.println();
        }
        
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s,int n){
        // code here
        int mid = (n+1)/2 ;
        Stack<Integer>st = new Stack<>();
        if(n%2 == 1)
        for(int i = 0 ; i < mid ; i++){
            st.push(s.pop());
        }
        else
        for(int i = 0 ; i <= mid ; i++){
            st.push(s.pop());
        }
        st.pop();
        while(!st.isEmpty()){
            s.push(st.pop());
        }
    } 
}

