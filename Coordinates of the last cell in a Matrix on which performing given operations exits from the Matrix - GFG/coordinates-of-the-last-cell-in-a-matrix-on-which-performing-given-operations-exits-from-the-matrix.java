//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            Solution obj = new Solution();
            int[] p = obj.endPoints(matrix,r,c);
            out.print("(" +  p[0]+ ", " +  p[1]+ ")" +"\n");
        }
        out.close();
    }
}


// } Driver Code Ends


//User function Template for Java


class Solution{
    static int [] endPoints(int [][]arr, int m, int n){
        //code here
        String up = "right";
        String right = "down";
        String down = "left";
        String left = "up";
        String dir = "right";
        int i = 0,j = 0;
        while(true){
            if(arr[i][j] == 0){
                if(dir.compareTo("right") == 0){
                    j++;
                    if(j >=n){
                        j=n-1;
                        break;
                    }
                    
                }
                else if(dir.compareTo("down") == 0){
                    i++;
                    if(i >=m){
                        i=m-1;
                        break;
                    }
                }
                else if(dir.compareTo("left") == 0){
                    j--;
                    if(j < 0){
                        j = 0;
                        break;
                    }
                }
                else{
                    i--;
                    if(i < 0){
                        i = 0;
                        break;
                    }
                }
            }
            else{
                arr[i][j] = 0;
                if(dir.compareTo("right") == 0){
                   dir = right;
                   i++;
                   if(i >=m){
                       i = m-1;
                       break;
                   }

                }
                else if(dir.compareTo("down") == 0){
                    dir = down;
                    j--;
                    if(j < 0){
                        j = 0;
                        break;
                    }

                }
                else if(dir.compareTo("left") == 0){
                    dir = left;
                    i--;
                    if(i < 0){
                        i = 0;
                        break;
                    }

                }
                else{
                    dir = up;
                    j++;
                    if(j >= n){
                        j = n-1;
                        break;
                    }

                }
            }
        }
        int []res = new int[2];
        res[0] = i;
        res[1] = j;
        return res;
    }
}