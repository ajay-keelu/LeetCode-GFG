class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1)
            return 1;
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            String a = Character.toString(s.charAt(i));
            if(hm.containsKey(a))
                hm.put(a,(int)hm.get(a)+1);
            else
                hm.put(a,1);
        }
        int even = 0,odd = 0,oc=0;
        for(Map.Entry e:hm.entrySet()){
            int n = (int)e.getValue();
            if(n%2==0)
                even+=n;
            else{
                oc++;
                    odd+=n-1;
            }
        }
        if(oc!=0)
            odd++;
        return odd+even;
        
    }
    
}