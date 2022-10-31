class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        if(words.length <= 1)
            return true;
        Map<Character,Integer>hm = new HashMap<>();
        for(int i = 0 ; i < 26 ; i++ )
            hm.put(order.charAt(i),i);
        hm.put(' ',-1);
        for(int i=1;i<words.length;i++)
        {
            if(!sort(words[i-1],words[i],hm))
                return false;
        }
        return true;
    }
    public static boolean sort(String st1,String st2,Map hm)
    {
        int n = st1.length();
        int m = st2.length();
        if(n>m)
        {
            for(int i = 0 ; i < n-m ; i++ )
            {
                st2 += ' ';
            }
        }
        else
        {
            for(int i = 0 ; i < n-m ; i++ )
            {
                st1 += ' ';
            }
        }
        for(int i = 0 ; i < n ; i++ )
        {
            int i1 = (int)hm.get(st1.charAt(i));
            int i2 = (int)hm.get(st2.charAt(i));
            if(i1>i2)
                return false;
            if(i1<i2)
                break;
        }
        return true;
    }
}