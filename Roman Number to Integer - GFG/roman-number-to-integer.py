#User function Template for python3

class Solution:
    def romanToDecimal(self, s): 
        # code here
        I           =  1
        V          =   5
        X         =    10
        L        =     50
        C       =      100
        D      =       500
        M     =        1000
        sm=0
        i=0
        while(i!=len(s)):
            if s[i]=='I':
                sm+=1
                i+=1
                try:
                    if(s[i]=='V'):
                        sm+=-1+4
                        i+=1
                    elif(s[i]=='X'):
                        i+=1
                        sm+=-1+9
                except:
                    pass
            elif s[i]=='V':
                sm+=5
                i+=1
            elif s[i]=='X':
                sm+=10
                i+=1
                try:
                    if(s[i]=='L'):
                        sm+=-10+40
                        i+=1
                    elif(s[i]=='C'):
                        i+=1
                        sm+=-10+90
                except:
                    pass
            elif s[i]=='L':
                sm+=50
                i+=1
            elif s[i]=='C':
                sm+=100
                i+=1
                try:
                    if(s[i]=='D'):
                        sm+=-100+400
                        i+=1
                    elif(s[i]=='M'):
                        i+=1
                        sm+=-100+900
                except:
                    pass
            elif s[i]=='D':
                sm+=500
                i+=1
            elif s[i]=='M':
                sm+=1000
                i+=1
        return sm


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=='__main__':
    t = int(input())
    for _ in range(t):
        ob = Solution()
        S = input()
        print(ob.romanToDecimal(S))
# } Driver Code Ends