class Solution {
    public String removeOuterParentheses(String s) {
        List<String>div = divstr(s);
        String res = "";
        for(int i = 0 ; i < div.size() ; i++ )
        {
            String temp = div.get(i);
            if(temp.length()>2)
                res+=temp.substring(1,temp.length()-1);
        }
        return res;
    }
    public static List<String> divstr(String s){
        String temp = "";
        int obc = 0,cbc = 0;
        List<String> arr = new ArrayList<>();
        for(int i = 0 ; i < s.length() ; i++)
        {
            char c = s.charAt(i);
            if(c == '(')
                obc++;
            else
                cbc++;
            temp+=c;
            if(cbc == obc && obc!=0)
            {
                arr.add(temp);
                temp = "";
                obc = 0;
                cbc = 0;
            }
        }
        return arr;
    }
}