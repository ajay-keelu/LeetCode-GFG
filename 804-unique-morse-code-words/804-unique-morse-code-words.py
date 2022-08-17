class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        s=[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        li=[]
        for i in words:
            st=''
            for j in i:
                st+=s[ord(j)-97]
            li.append(st)
        return len(list(set(li)))