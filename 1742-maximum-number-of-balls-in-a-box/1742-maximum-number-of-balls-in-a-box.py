class Solution:
    def countBalls(self, low: int, high: int) -> int:
        li=[]
        for i in range(high+low+1):
            li.append(0)
        for i in range(low,high+1):
            sm=sum(list(map(int,list(str(i)))))
            li[sm-1]+=1
        return max(li)
            