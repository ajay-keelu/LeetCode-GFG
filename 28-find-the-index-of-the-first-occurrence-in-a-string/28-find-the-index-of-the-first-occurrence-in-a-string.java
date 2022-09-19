class Solution {
    public int strStr(String h, String ne) {
        int l1=h.length();
        int l2 = ne.length();
        try{
            for(int i=0;i<l1;i++){
                if(h.substring(i,i+l2).compareTo(ne)==0)
                    return i;
            }
        }
        catch(Exception e){
            return -1;
        }
        return -1;
    }
}