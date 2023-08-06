//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public ArrayList<String> permutation(String s){
        ArrayList<String> res = new ArrayList<>();
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
            int arr[] = new int[n];
            arr[i] = 1;
            prem(s.charAt(i)+"",res,n,arr,s.toCharArray());
        }
        Collections.sort(res);
        return res;
    }
    static void prem(String r,ArrayList<String> res,int n,int[] arr,char[] chr){
        if(r.length() == n){
            res.add(r);
            return;
        }
        for(int i = 0 ; i < n ; i++){
            int []temp = arr.clone();
            if(temp[i] == 0){
                temp[i] = 1;
                prem(r+chr[i],res,n,temp,chr);
            }
        }
        return;
    }
}
