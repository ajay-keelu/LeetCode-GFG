class Solution {
    public boolean isPerfectSquare(int num) {
      int n = (int)Math.sqrt(num);
        if(num == n*n)
            return true;
        return false;
    }
}