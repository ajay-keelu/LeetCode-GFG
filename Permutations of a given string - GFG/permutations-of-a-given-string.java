//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        Set<String> res = new HashSet<>();
        int n = S.length();
        char[] chr = S.toCharArray();
        for(int i = 0 ; i < n ; i++){
            int[] arr = new int[n];
            arr[i] =1;
            premut(chr[i]+"",res,arr,chr);
        }
        List<String>li = new ArrayList<>();
        for(String s: res)
            li.add(s);
        Collections.sort(li);
        return li;
    }
    static void premut(String r,Set<String> li,int[] arr,char[] chr){
        if(r.length() == chr.length){
            li.add(r);
            return ;
        }
        for(int i = 0 ; i < chr.length ; i++){
            int[] temp = arr.clone();
            if(temp[i] == 0){
                temp[i] = 1;
                premut(r+chr[i],li,temp,chr);
            }
        }
    }
}