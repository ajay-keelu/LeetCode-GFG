class Solution {
    public int commonFactors(int a, int b) {
        int c = 0 ; 
        if(a>b){
            for(int i = 1 ; i<=b;i++)
                if(a%i == 0 && b%i == 0)
                    c++;
        }
        else{
            for(int i = 1 ; i<=a;i++)
                if(a%i == 0 && b%i == 0)
                    c++;
        }
        return c;
    }
}