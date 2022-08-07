class Solution {
public:
    int fib(int n) {
        if (n==0)
            return 0;
        else if( n==1)
            return 1;
        else{
            int x=0;
            int y=1;
            int sm=0;
            for(int i = 2 ; i<n+1;i++){
                sm=x+y;
                x=y;
                y=sm;
                }
            return sm;
        }
    }
};