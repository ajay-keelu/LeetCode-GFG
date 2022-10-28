class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int r1,c1;
        r1 = mat.length;
        c1 = mat[0].length;
        if( r1*c1 != r*c)
            return mat;
        int[][] res =new int[r][c];
        int i=0;
        int[] temp = new int[r*c];
        for(int j = 0 ; j < r1 ; j++ )
        {
            for(int k = 0 ; k < c1 ; k++ )
            {
                temp[i++] = mat[j][k];
            }
        }
        i=0;
        for(int j=0 ; j < r; j++ )
        {
            for(int k = 0 ; k<c ; k++)
            {
                res[j][k] = temp[i++];
            }
        }
        return res;
    }
}