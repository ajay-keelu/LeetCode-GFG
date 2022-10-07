class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = {0,1};
        List<Integer>al = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            al.add(nums[i]);
        }
        for(int i=0;i<al.size();i++)
        {
            int n =(int) al.get(i);
            if(al.contains(target-n))
            {
                arr[0] = i;
                int index =  al.indexOf(target-n);
                if(i == index)
                    continue;
                arr[1] =index;
                break;
            }
        }
        return arr;
    }
}