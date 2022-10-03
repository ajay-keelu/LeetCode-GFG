class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int e:nums)
            sum+=e;
        int n = nums.length;
        return n*(n+1)/2 - sum;
    }
}