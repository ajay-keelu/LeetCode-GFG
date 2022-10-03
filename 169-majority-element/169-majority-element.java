class Solution {
    public int majorityElement(int[] a) {
         HashMap<Integer,Integer>hm = new HashMap<>();
        int size = a.length;
        for(int i=0;i<size;i++)
        {
            if(hm.containsKey(a[i]))
            {
                hm.put(a[i],(int)hm.get(a[i])+1);
            }
            else
            hm.put(a[i],1);
        }
        for(Map.Entry e : hm.entrySet())
        {
            if((int)e.getValue()>size/2)
            return (int)e.getKey();
        }
        return -1;
    }
}