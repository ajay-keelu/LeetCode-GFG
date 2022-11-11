class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer>st =new ArrayList<>();
        for(int i: nums)
        {
            if(st.size() == 0)
                st.add(i);
            else if((int)st.get(st.size()-1) != i)
                st.add(i);
        }
        for(int i = 0; i < st.size();i++)
            nums[i] = (int)st.get(i);
        //return ;
        return st.size();
    }
}