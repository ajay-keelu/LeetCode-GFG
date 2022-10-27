class Solution {
    public int maximumWealth(int[][] a) {
        int max = 0;
        for(int i=0;i<a.length;i++)
        {
            int sm = 0 ;
            for(int j = 0 ; j < a[i].length ; j++)
            {
                sm+=a[i][j];
            }
            if(max < sm)
                max = sm;
        }
        return max;
    }
}