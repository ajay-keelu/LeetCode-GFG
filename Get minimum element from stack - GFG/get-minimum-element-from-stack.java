//{ Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}



// } Driver Code Ends


class GfG
{
    int minEle;
    Stack<Integer> s;
    Stack<Integer> st;
    // Constructor    
    GfG()
	{
        s = new Stack<>();
        st = new Stack<>();
	}
	
    /*returns min element from stack*/
    int getMin()
    {
        if(s.isEmpty())
            return -1;
        int min = Integer.MAX_VALUE;
        while(!s.isEmpty()){
            int val = s.pop();
            st.push(val);
            min = min > val ? val : min;
        }
        while(!st.isEmpty()){
            s.push(st.pop());
        }
        return min;
	// Your code here
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	if(s.isEmpty())
	    return -1;
	return s.pop();
    }

    /*push element x into the stack*/
    void push(int x)
    {
	    // Your code here
	    s.push(x);
    }	
}

