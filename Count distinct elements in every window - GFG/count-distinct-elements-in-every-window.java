//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        // code here 
        ArrayList<Integer> al = new ArrayList<>();
		Map<Integer,Integer>mp = new HashMap<>();
		//int n = s.length();
		int flag = 0;
		for(int i = 0 ; i < n-k+1 ; i++ )
		{
			if(flag == 0)
			{
				for(int j= 0; j< k ; j++ )
				{
					int c = arr[j];//s.charAt(j);
					if(mp.containsKey(c))
						mp.put(c, (int)mp.get(c)+1);
					else
						mp.put(c, 1);
				}
				flag =1;
				//i+=k;
			}
			else {
				int c = arr[i+k-1];// s.charAt(i+k-1);
				if(mp.containsKey(c)) {
					mp.put(c, (int)mp.get(c)+1);
				}
				else
					mp.put(c, 1);
				c = arr[i-1];// s.charAt(i - 1);
				mp.put(c, (int)mp.get(c) - 1 );
				if((int)mp.get(c) == 0)
					mp.remove(c);
			}
			//System.out.println(mp);
			al.add(mp.size());
		}
		return al;
    }
}

