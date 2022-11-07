class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int lcs[][] = new int[n+1][m+1];
        for(int i = 0 ; i < n ; i++)
            lcs[i][0] = 0;
        for(int i = 0 ; i < m ; i++)
            lcs[0][i] = 0;
        for(int i = 1 ; i <= n ; i++ )
        {
            for(int j = 1 ; j <= m ; j++)
            {
                if(text1.charAt(i-1) == text2.charAt(j-1))
                    lcs[i][j] = 1 + lcs[i-1][j-1];
                else
                    lcs[i][j] = Math.max(lcs[i-1][j],lcs[i][j-1]);
            }
        }
        return lcs[n][m];
    }
}