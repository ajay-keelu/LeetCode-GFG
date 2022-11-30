class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        List<Integer>li = new ArrayList<>();
        Set<Integer>st = new HashSet<>();
        Map<Integer,Integer>mp = new HashMap<>();
        for(int i= 0 ; i < arr.length ; i++ )
        {
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry e : mp.entrySet()){
            li.add((int)e.getValue());
            st.add((int)e.getValue());
        }
        if(st.size()!=li.size())
            return false;
        return true;
    }
}