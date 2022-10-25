class Solution {
    public int arraySign(int[] nums) {
        int nc = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i]<0)
                nc++;
            else if(nums[i] == 0)
                return 0;
        }
        if(nc%2==0)
            return 1;
        return -1;
    }
}