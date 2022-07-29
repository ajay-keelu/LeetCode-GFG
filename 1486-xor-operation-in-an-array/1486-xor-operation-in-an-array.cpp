class Solution {
public:
    int xorOperation(int n, int start) {
        int s=start;
        for(int i=1;i<n;i++){
            s=s^(start+2*i);
        }
        return s;
    }
};