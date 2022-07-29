class Solution:
    def maximum69Number (self, num: int) -> int:
        mx=num
        i=0
        while(i!=len(str(num))):
            li=list(str(num))
            if li[i]=='6':
                li[i]='9'
            else:
                li[i]='6'
            mx=max(mx,int(''.join(li)))
            
            i+=1
        return mx