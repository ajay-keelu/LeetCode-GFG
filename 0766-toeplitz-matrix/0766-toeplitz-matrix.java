class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n,m;
        n = matrix.length;
        m = matrix[0].length;
        if(n<=1 || m<=1 )
            return true;
        for(int i=1;i<n;i++)
        {
            for(int j = 1;j<m ; j++ )
            {
                if(matrix[i-1][j-1]!=matrix[i][j])
                    return false;
            }
        }
        return true;
    }
}