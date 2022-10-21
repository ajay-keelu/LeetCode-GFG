//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] input = new String[2]; 
            input = read.readLine().split(" "); 
            int R = Integer.parseInt(input[0]); 
            int C = Integer.parseInt(input[1]); 
            String s1[] = read.readLine().trim().split("\\s+");
            int a[][] = new int[R][C];
            for(int i = 0;i < R*C;i++)
                a[i/C][i%C] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int[] ans = ob.reverseSpiral(R,C,a);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] a)
    {
        // code here
        List<Integer>li = new ArrayList<>();
	    int top,bot,left,rig,dir;
	    dir = 0;
	    top = 0;
	    left= 0;
	    rig = C-1;
	    bot = R-1;
	    while(left<=rig &&top<=bot)
	    {
	        if(dir == 0 )
	        {
	            for(int i=left;i<=rig;i++)
	            li.add(a[top][i]);
	            dir++;
	            top++;
	        }
	        else if(dir == 1 )
	        {
	            for(int i=top;i<=bot;i++)
	            li.add(a[i][rig]);
	            dir++;
	            rig--;
	        }
	        else if(dir == 2 )
	        {
	            for(int i=rig;i>=left;i--)
	            li.add(a[bot][i]);
	            dir++;
	            bot--;
	        }
	        else
	        {
	            for(int i=bot;i>=top;i--)
	            li.add(a[i][left]);
	            dir++;
	            left++;
	        }
	        dir = dir%4;
	    }
	    Collections.reverse(li);
	    int arr[] = new int[li.size()];
	    for(int i=0;i<li.size();i++)
	    arr[i] = (int)li.get(i);
	    return arr;
    }
}