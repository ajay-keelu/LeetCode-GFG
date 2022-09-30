class Solution {
    public int findFinalValue(int[] nums, int or) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!hm.containsKey(nums[i]))
                hm.put(nums[i],1);
        }
        while(hm.containsKey(or))
        {
            or*=2;
        }
        return or;
    }
}