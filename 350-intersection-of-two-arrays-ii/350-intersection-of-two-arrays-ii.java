class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1,n2;
        n1 = nums1.length;
        n2 = nums2.length;
        ArrayList<Integer>al = new ArrayList<>();
        if(n1>=n2){
            HashMap<Integer,Integer>hm = new HashMap<>();
            for(int i=0;i<n1;i++)
            {
                if(hm.containsKey(nums1[i]))
                    hm.put(nums1[i],(int)hm.get(nums1[i])+1);
                else
                    hm.put(nums1[i],1);
            }
            for(int i=0;i<n2;i++)
            {
                if(hm.containsKey(nums2[i]))
                {
                    if(hm.get(nums2[i])>0)
                    {
                        hm.put(nums2[i],(int)hm.get(nums2[i])-1);
                        al.add(nums2[i]);
                    }
                }
            }
        }
        else{
            HashMap<Integer,Integer>hm = new HashMap<>();
            for(int i=0;i<n2;i++)
            {
                if(hm.containsKey(nums2[i]))
                    hm.put(nums2[i],(int)hm.get(nums2[i])+1);
                else
                    hm.put(nums2[i],1);
            }
            for(int i=0;i<n1;i++)
            {
                if(hm.containsKey(nums1[i]))
                {
                    if(hm.get(nums1[i])>0)
                    {
                        hm.put(nums1[i],(int)hm.get(nums1[i])-1);
                        al.add(nums1[i]);
                    }
                }
            }
        }
        int arr[] = new int[al.size()];
        for(int i=0;i<al.size();i++)
            arr[i] = al.get(i);
        return arr;
    }
}