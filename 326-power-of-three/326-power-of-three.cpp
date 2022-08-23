class Solution {
public:
    bool isPowerOfThree(int n) {
        Solution s;
        if(n==0)
            return false;
        if(n==1)
            return true;
        else if(n%3==0){
                return s.isPowerOfThree(n/3);
        }
        else
            return false;
    }
};