class Solution {
public:
    int divide(int dividend, int divisor) {
     double a =  (double)dividend/divisor;
        long long b=trunc(a);
        if(a>-pow(2,31) and a<pow(2,31)-1)
        return a;
        else if(a<-pow(2,31)+1)
            return -pow(2,31);
        else
            return pow(2,31)-1;
    }
};