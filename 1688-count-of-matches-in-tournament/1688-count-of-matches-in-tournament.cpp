class Solution {
public:
    int numberOfMatches(int n) {
        int sm=0;
        while(n>1){
            if(n%2==0){
                sm+=n/2;
                n=n/2;
            }
            else{
                sm+=n/2;
                n=n/2+1;
            }
        }
        return sm;
    }
};