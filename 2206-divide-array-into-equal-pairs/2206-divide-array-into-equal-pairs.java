class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
                hm.put(nums[i],(int)hm.get(nums[i])+1);
            else
                hm.put(nums[i],1);
        }
        for(Map.Entry e : hm.entrySet())
        {
            if((int)e.getValue()%2==1)
                return false;
        }
        return true;
    }
}