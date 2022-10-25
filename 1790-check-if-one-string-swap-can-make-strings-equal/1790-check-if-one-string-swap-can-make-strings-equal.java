class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        Map<Character,Integer>hm1 = new HashMap<>();
        Map<Character,Integer>hm2 = new HashMap<>();
        int n = s1.length();
        for(int i=0;i<n;i++){
            char c;
            c = s1.charAt(i);
            if(hm1.containsKey(c))
                hm1.put(c,(int)hm1.get(c)+1);
            else
                hm1.put(c,1);
            c = s2.charAt(i);
            if(hm2.containsKey(c))
                hm2.put(c,(int)hm2.get(c)+1);
            else
                hm2.put(c,1);
        }
        for(Map.Entry e : hm1.entrySet())
        {
            char c = (char)e.getKey();
            if(hm2.containsKey(c))
            {
                if((int)e.getValue() != (int)hm2.get(c))
                    return false;
            }
            else{
                return false;
            }
        }
        int c = 0,flag = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
                c++;
            if(c>2)
            {
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            return true;
        return false;
    }
}