class Solution {
public:
    bool isPowerOfTwo(int n) {
        Solution s;
        if(n==0)
            return false;
        if(n==1)
            return true;
        else if(n%2==0){
            if(n/2==(float)n/2)
                return s.isPowerOfTwo(n/2);
            else
                return false;
        }
        else{
            return false;
        }
    }
};