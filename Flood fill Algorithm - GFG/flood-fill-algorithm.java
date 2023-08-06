//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] image =  new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S2 = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    image[i][j] = Integer.parseInt(S2[j]);
            }
            String[] S3 = br.readLine().trim().split(" ");
            int sr = Integer.parseInt(S3[0]);
            int sc = Integer.parseInt(S3[1]);
            int newColor = Integer.parseInt(S3[2]);
            Solution obj = new Solution();
            int[][] ans = obj.floodFill(image, sr, sc, newColor);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++)
                    System.out.print(ans[i][j] + " ");
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // Code here 
        int n = image.length;
        int m = image[0].length;
        int[][] vis = new int[n][m];
        fill(sr,sc,vis,image,newColor,n,m,image[sr][sc]);
        return image;
    }
    static void fill(int i,int j,int[][] vis,int[][] image,int col,int n,int m,int p){
        if( i < 0 || i >= n || j < 0 || j >= m )
            return;
        if(vis[i][j] == 0 && image[i][j] == p){
            if(image[i][j] == p)
                image[i][j] = col;
            vis[i][j] = 1;
            fill(i-1,j,vis,image,col,n,m,p);
            fill(i,j-1,vis,image,col,n,m,p);
            fill(i+1,j,vis,image,col,n,m,p);
            fill(i,j+1,vis,image,col,n,m,p);
        }
    }
}