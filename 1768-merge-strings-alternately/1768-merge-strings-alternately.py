class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        i=0
        st=''
        while(i!=len(word1) and i!=len(word2)):
            st+=word1[i]+word2[i]
            i+=1
        st+=word1[i:]+word2[i:]
        return st        