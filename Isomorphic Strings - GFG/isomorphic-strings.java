//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

// } Driver Code Ends


class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String s,String t)
    {
        Map<Character,Character>hm =new HashMap<>();
        List<Character>al = new ArrayList<>();
        int n = s.length();
        int m = t.length();
        if(n!=m)
            return false;
        for(int i=0;i<n;i++)
        {
            char c1 = s.charAt(i),c2 = t.charAt(i);
            if (hm.containsKey(c1))
			{
				if ((char)hm.get(c1) != c2)
					return false;
			}
            else{
                if(al.contains(c2))
                    return false;
                hm.put(c1,c2);
                al.add(c2);
            }
                
        }
        return true;
    }
}