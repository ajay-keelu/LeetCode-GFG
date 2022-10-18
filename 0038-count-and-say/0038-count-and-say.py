class Solution:
    def countAndSay(self, n: int) -> str:
        if n == 1 :
            return "1"
        st = "1"
        for  i in range(1,n):
            st = Solution.say(st)
        return st
    
    def say(st):
        temp = ""
        c = 1
        for i in range(len(st)):
            try:
                if st[i] == st[i+1] :
                    c+=1
                else:
                    temp += str(c)+i
                    c = 1
            except :
                
                    temp += str(c)+st[i]
                    c = 1
        return temp