class Solution {
    public int searchInsert(int[] nums, int target) {
        int st = 0,end = nums.length-1;
        int mid = (st+end)/2;
        while(st<=end){
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                end = mid-1;
            else
                st = mid+1;
            mid = (st+end)/2;
        }
        return st;
    }
}