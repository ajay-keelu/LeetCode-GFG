class Solution {
    public String reverseWords(String s) {
        String st[] = (s.trim()).split(" ");
        String temp="";
        int i = st.length-1;
        while(i>=0)
        {
            if(st[i]==""){
                i--;
                continue;
            }
            if(i==0)
                temp+=st[0];
            else
                temp+=st[i]+" ";
            i--;
        }
        return temp;
    }
}