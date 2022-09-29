class Solution {
    public boolean judgeSquareSum(int c) {
        int n = (int)Math.sqrt(c);
       for(long i=0;i<=n;i++){
           long j =c - i*i;
           long sq = (int)Math.sqrt(j);
           if(sq*sq==j)
               return true;
       }
        return false;
    }
}