class Solution:
    def sumZero(self, n: int) -> List[int]:
        li=[]
        for i in range(1,n//2+1):
            li.append(i)
        for i in range(1,n//2+1):
            li.append(-i)
        if n%2==1:
            li.insert(n//2,0)
        return li