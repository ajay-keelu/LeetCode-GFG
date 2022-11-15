class Solution {
    public int[][] generateMatrix(int n) {
        int top = 0,left = 0,rig = n-1,bot = n-1;
        int[][] a = new int[n][n];
        int dir = 0;
        int c = 1;
        while(left<=rig &&top<=bot)
	    {
	        if(dir == 0 )
	        {
	            for(int i=left;i<=rig;i++)
	               a[top][i] = c++;
	            dir++;
	            top++;
	        }
	        else if(dir == 1 )
	        {
	            for(int i=top;i<=bot;i++)
	                a[i][rig] = c++;
	            dir++;
	            rig--;
	        }
	        else if(dir == 2 )
	        {
	            for(int i=rig;i>=left;i--)
	                a[bot][i] = c++;
	            dir++;
	            bot--;
	        }
	        else
	        {
	            for(int i=bot;i>=top;i--)
	                a[i][left] = c++;
	            dir++;
	            left++;
	        }
	        dir = dir%4;
	    }
        return a;
    }
}