class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character>hm =new HashMap<>();
        List<Character>al = new ArrayList<>();
        int n = s.length();
        int m = t.length();
        if(n!=m)
            return false;
        for(int i=0;i<n;i++)
        {
            char c1 = s.charAt(i),c2 = t.charAt(i);
            if (hm.containsKey(c1))
			{
				if ((char)hm.get(c1) != c2)
					return false;
			}
            else{
                if(al.contains(c2))
                    return false;
                hm.put(c1,c2);
                al.add(c2);
            }
                
        }
        return true;
    }
}