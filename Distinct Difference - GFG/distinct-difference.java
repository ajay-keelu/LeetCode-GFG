//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.getDistinctDifference(N, A);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> getDistinctDifference(int n, int[] arr) {
        // code here
        Set<Integer>lset = new HashSet<>();
        Map<Integer,Integer>rmp = new HashMap<>();
        ArrayList<Integer>li = new ArrayList<>();
        for(int i:arr){
            rmp.put(i,rmp.getOrDefault(i,0)+1);
        }
        for(int i:arr){
            rmp.put(i,rmp.get(i)-1);
            if(rmp.get(i) == 0)
                rmp.remove(i);
            li.add(lset.size() - rmp.size());
            lset.add(i);
        }
        return li;
    }
}
        
