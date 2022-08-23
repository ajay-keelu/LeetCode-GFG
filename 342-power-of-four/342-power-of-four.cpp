class Solution {
public:
    bool isPowerOfFour(int n) {
        Solution s;
        if(n==0)
            return false;
        if(n==1)
            return true;
        else if(n%4==0){
            if(n/4==(float)n/4){
                return s.isPowerOfFour(n/4);
            }
            else
                return false;
        }
        else
            return false;
    }
};