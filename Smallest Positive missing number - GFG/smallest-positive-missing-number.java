//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends


class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int mx = 0;
        for(int e:arr)
        if(e>mx)
        mx = e;
        
        int li[] = new int[mx+1];
        for(int e:arr)
        if(e>0)
            li[e]=1;
        
        for(int i = 1 ;i< li.length;i++ )
        {
            if(li[i] == 0 )
            return i;
        }
        return mx+1;
    }
}


//{ Driver Code Starts.

class Main
{   
    public static void main (String[] args) 
    {

		Scanner sc=new Scanner(System.in);
		
        //taking testcases
		int t=sc.nextInt();
		while(t-->0){
		    
		    //input number n
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			System.out.println(missing);
		}
    }
}


// } Driver Code Ends