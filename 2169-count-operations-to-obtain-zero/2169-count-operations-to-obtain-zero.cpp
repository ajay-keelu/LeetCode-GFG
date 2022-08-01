class Solution {
public:
    int countOperations(int num1, int num2) {
        int c=0;
        while(true){
            if(num1==0 || num2==0)
                break;
            else if (num1>=num2 ){
                num1-=num2;
                c+=1;}
            else{
                num2-=num1;
                c+=1;}
            }
        return c;
    }
};