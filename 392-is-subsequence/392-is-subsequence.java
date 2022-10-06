class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
            return true;
        if(t.length()==0)
            return false;
        int i=0,j=0;
        int c=0;
        while(true)
        {
            if(s.charAt(i)==t.charAt(j))
                i++;
            j++;
            if(i == s.length())
                return true;
            if(j==t.length())
                break;
        }
        return false;
    }
}