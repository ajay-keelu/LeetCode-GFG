//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(s[i + 1]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[] ans = obj.topK(nums, k);
            for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public int[] topK(int[] nums, int k) {
        // Code here
        int res[] = new int[k];
        Map<Integer,Integer>mp = new HashMap<>();
        for(int i :nums)
            mp.put(i,mp.getOrDefault(i,0)+1);
        int s[][] = new int[mp.size()][2];
        int i = 0;
        for(Map.Entry e:mp.entrySet()){
            s[i][0] = (int)e.getValue();
            s[i][1] = (int)e.getKey();
            i++;
        }
        sort(s,0,s.length-1);
        for(i = 0 ; i < k ; i++){
            res[i] = s[i][1];
        }
        return res;
    }
    public static void sort(int[][] arr,int st,int end){
        if(st < end){
            int mid = (st+end)/2;
            sort(arr,st,mid);
            sort(arr,mid+1,end);
            merge(arr,st,mid,end);
        }
    }
    public static void merge(int[][] arr,int st,int mid,int end){
        int n1 = mid-st+1;
        int n2 = end-mid;
        int l[][] = new int[n1][2];
        int r[][] = new int[n2][2];
        for(int i = 0 ; i < n1; i++){
            l[i][0] = arr[st+i][0];
            l[i][1] = arr[st+i][1];
        }
        for(int i = 0 ; i < n2 ;i++){
            r[i][0] = arr[mid+1+i][0];
            r[i][1] = arr[mid+1+i][1];
        }
        int i = 0,j = 0;
        int k = st;
        while(i < n1 && j < n2){
            if(l[i][0] > r[j][0]){
                arr[k][0] = l[i][0];
                arr[k][1] = l[i][1];
                k++;
                i++;
            }else if(l[i][0] == r[j][0]){
                if(l[i][1] > r[j][1]){
                    arr[k][0] = l[i][0];
                    arr[k][1] = l[i][1];
                    k++;
                    i++;
                }else{
                    arr[k][0] = r[j][0];
                    arr[k][1] = r[j][1];
                    k++;
                    j++;
                }
            }else{
                arr[k][0] = r[j][0];
                arr[k][1] = r[j][1];
                k++;
                j++;
            }
        }
        while(i < n1){
            arr[k][0] = l[i][0];
            arr[k][1] = l[i][1];
            k++;
            i++;
        }
        while(j < n2){
            arr[k][0] = r[j][0];
            arr[k][1] = r[j][1];
            k++;
            j++;
        }
    }
}