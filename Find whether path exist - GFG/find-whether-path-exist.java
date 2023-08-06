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
            int n = Integer.parseInt(br.readLine().trim());
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            boolean ans = obj.is_Possible(grid);
            if(ans)
                System.out.println("1");
            else 
                System.out.println("0");
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to find whether a path exists from the source to destination.
    public boolean is_Possible(int[][] grid)
    {
        // Code here
        int n = grid.length;
        int src[] = source(grid);
        int[] res = {0};
        int des[] = desti(grid);
        int[][] vis = new int[n][n];
        // vis[src[0]][src[1]] = 1;
        findPath(src[0],src[1],des[0],des[1],res,grid,vis,n);
        if(res[0] == 0) return false;
        return true;
    }
    static void findPath(int i,int j,int x,int y, int[] res,int[][] grid,int [][]vis,int n){
        if(i < 0 || i >= n || j < 0 || j >= n)
            return ;
        if(grid[i][j] == 0)
            return ;
        if(i == x && j == y){
            res[0] = 1;
            return ;
        }
        if(vis[i][j] == 1)
            return;
        vis[i][j] = 1;
        findPath(i+1,j,x,y,res,grid,vis,n);
        findPath(i-1,j,x,y,res,grid,vis,n);
        findPath(i,j-1,x,y,res,grid,vis,n);
        findPath(i,j+1,x,y,res,grid,vis,n);
    }
    static int[] source(int[][] grid){
        int arr[] = {-1,-1};
        for(int i = 0 ; i < grid.length ; i++){
            int f = 1;
            for(int j = 0 ; j < grid.length ; j++){
                if(grid[i][j] == 1){
                    f = 0;
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
            if(f == 0)
                break;
        }
        return arr;
    }
    static int[] desti(int[][] grid){
        int arr[] = {-1,-1};
        for(int i = 0 ; i < grid.length ; i++){
            int f = 1;
            for(int j = 0 ; j < grid.length ; j++){
                if(grid[i][j] == 2){
                    f = 0;
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
            if(f == 0)
                break;
        }
        return arr;
    }
}