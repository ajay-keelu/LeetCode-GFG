//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends




//User function Template for Java



class Solution {
    int count(int[] nums, int n, int target) {
        int res[]={-1,-1};
        int fst = bin(nums,0,nums.length-1,target);
        int a = fst;
        if(fst <0)
            return 0;
        int fin = fst;
        while(fst>=0)
        {
            fin = fst;
            fst = bin(nums,fst+1,nums.length-1,target);
        }
        res[1] = fin;
        int stin = a;
        while(a>=0)
        {
            stin = a;
            a = bin(nums,0,a-1,target);
        }
        res[0] = stin;
        return res[1]-res[0]+1;
    }
    public static int bin(int arr[],int st,int end,int key)
    {
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid] == key)
                return mid;
            else if (arr[mid]<key)
                st = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
}