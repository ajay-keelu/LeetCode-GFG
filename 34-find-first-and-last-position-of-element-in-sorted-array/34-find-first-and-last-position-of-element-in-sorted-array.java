class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[]={-1,-1};
        int fst = bin(nums,0,nums.length-1,target);
        int a = fst;
        if(fst <0)
            return res;
        int fin = fst;
        while(fst>=0)
        {
            fin = fst;
            fst = bin(nums,fst+1,nums.length-1,target);
        }
        res[1] = fin;
        int stin = a;
        while(a>=0)
        {
            stin = a;
            a = bin(nums,0,a-1,target);
        }
        res[0] = stin;
        return res;
    }
    public static int bin(int arr[],int st,int end,int key)
    {
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid] == key)
                return mid;
            else if (arr[mid]<key)
                st = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
}