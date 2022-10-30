class Solution:
    def freqAlphabets(self, s: str) -> str:
        st=""
        for i in range(len(s)):
            if(s[i]=='#'):
                st=st[:-2]
                st+=chr(int(s[i-2:i])+96)
            else:
                 st+=chr(int(s[i])+96)
        return(st)