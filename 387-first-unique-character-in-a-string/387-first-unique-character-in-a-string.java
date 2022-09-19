class Solution {
    public int firstUniqChar(String s) {
        HashMap<String,Integer>hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            String a = Character.toString(s.charAt(i));
            if(hm.containsKey(a))
                hm.put(a,(int)hm.get(a)+1);
            else
                hm.put(a,1);
        }
        for(int i=0;i<s.length();i++){
            String a = Character.toString(s.charAt(i));
            if((int)hm.get(a)==1)
                return i;
        }
        return -1;
    }
}