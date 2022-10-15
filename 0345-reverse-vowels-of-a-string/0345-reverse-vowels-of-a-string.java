class Solution {
    public String reverseVowels(String s) {
        List<Character>al = new ArrayList<>();
        String vowel = "aeiouAEIOU";
        String st = "";
        for(int i  = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(vowel.contains(ch+"")){
                al.add(ch);
            }
        }
        int i = al.size()-1;
        for(int j  = 0;j<s.length();j++)
        {
            char ch = s.charAt(j);
            if(vowel.contains(ch+"")){
                st+=(char)al.get(i);
                i--;
            }
            else{
                st+=ch;
            }
        }
        return st;
    }
}