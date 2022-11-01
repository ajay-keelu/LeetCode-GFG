class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        Map<Character,Integer>hm1 = new HashMap<>();
        Map<Character,Integer>hm2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(hm1.containsKey(c))
                hm1.put(c,(int)hm1.get(c)+1);
            else
                hm1.put(c,1);
        }
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(hm2.containsKey(c))
                hm2.put(c,(int)hm2.get(c)+1);
            else
                hm2.put(c,1);
        }
        for(Map.Entry e : hm1.entrySet()){
            if(hm2.containsKey((char)e.getKey()))
            {
                if((int)e.getValue() != (int)hm2.get((char)e.getKey()))
                    return false;
            }
            else
                return false;
        }
        return true;
    }
}