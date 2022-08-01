class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        li=[]
        for i in range(left,right+1):
            t=str(i)
            c=0
            for j in t:
                try:
                    if i%int(j)==0:
                        c+=1
                except:
                    pass
            if c == len(t):
                li.append(i)
        return li