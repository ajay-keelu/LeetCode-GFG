class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer>hm = new HashMap<>();
        for(int e:nums){
            if(hm.containsKey(e))
                hm.put(e,(int)hm.get(e)+1);
            else
                hm.put(e,1);
        }
        for(Map.Entry e : hm.entrySet())
        {
            if((int)e.getValue() >= 2)
                return true;
        }
        return false;
    }
}