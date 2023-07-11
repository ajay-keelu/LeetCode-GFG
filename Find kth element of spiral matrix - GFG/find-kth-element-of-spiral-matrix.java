//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method*/
    int findK(int a[][], int n, int m, int k)
    {
	// Your code here
	List<Integer>li = new ArrayList<>();
	    int top,bot,left,rig,dir;
	    dir = 0;
	    top = 0;
	    left= 0;
	    rig = m-1;
	    bot = n-1;
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
	        if(li.size() > k)
	            break;
	    }
	    return (int)li.get(k-1);
    }
}