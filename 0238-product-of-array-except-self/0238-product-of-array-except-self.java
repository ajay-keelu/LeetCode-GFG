class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre[] = new int[nums.length];
        pre[0] = nums[0];
        int suf[] = new int[nums.length];
        suf[nums.length - 1] = nums[nums.length - 1];
        for(int i=0;i<nums.length;i++)
        {
            if(i!=0)
                pre[i] = pre[i-1]*nums[i];
            if(i!=nums.length - 1)
                suf[nums.length - 2 - i] = suf[nums.length - 1 - i]*nums[nums.length-2-i];
        }
        int res[] = new int[nums.length];
        res[0] = suf[1];
        res[nums.length-1] = pre[nums.length-2];
        for(int i = 1 ;i<nums.length -1;i++)
        {
            res[i] = pre[i-1]*suf[i+1];
        }
        return res;
    }
}