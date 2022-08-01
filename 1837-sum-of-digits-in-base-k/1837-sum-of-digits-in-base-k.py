class Solution:
    def sumBase(self, n: int, k: int) -> int:
        res=[]
        while(n):
            res.append(n%k)
            n//=k
        return sum(res)