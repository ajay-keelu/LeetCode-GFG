class Solution {
    public int countGoodSubstrings(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        int ct = 0;
        int flag = 0;
        for(int i = 0 ; i < s.length() - 2 ; i++)
        {
            if(flag == 0)
            {
                for(int j = 0 ; j < 3; j++)
                    mp.put(s.charAt(j),(int)mp.getOrDefault(s.charAt(j),0)+1);
                flag = 1;
            }
            else{
                char c = s.charAt(i + 2);
                mp.put(c,(int)mp.getOrDefault(c,0)+1);
                c = s.charAt(i-1);
                mp.put(c,(int)mp.get(c)-1);
                if((int)mp.get(c) == 0)
                    mp.remove(s.charAt(i-1));
            }
            //System.out.println(mp);
            if(mp.size() == 3)
                ct++;
        }
        return ct;
    }
}