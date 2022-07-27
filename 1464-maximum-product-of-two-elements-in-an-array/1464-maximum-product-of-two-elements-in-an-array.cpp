class Solution {
public:
    int maxProduct(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int n=nums.size();
        int n1=nums[n-1],n2=nums[n-2];
        return (n1-1)*(n2-1);
    }
};