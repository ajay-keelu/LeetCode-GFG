class Solution {
public:
    int numberOfSteps(int num) {
        int c=0;
    while(num){
        if(num%2==0){
            num/=2;
            c+=1;
        }else{
            num-=1;
            c+=1;
        }
    }
        return c;
    }
};