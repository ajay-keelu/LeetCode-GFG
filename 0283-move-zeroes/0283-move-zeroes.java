class Solution {
    public void moveZeroes(int[] nums) {
        int i,j;
        int n = nums.length;
        for( i = 0 ; i < n ; i++ )
        {
            if(nums[i]==0)
            for( j = i+1 ; j < n ; j++ )
            {
                if(nums[j]!=0)
                {
                    int t = nums[j];
                    nums[j] = nums[i];
                    nums[i] = t;
                    break;
                }
                    
            }
        }
    }
}