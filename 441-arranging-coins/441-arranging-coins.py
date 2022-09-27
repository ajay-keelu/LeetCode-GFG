class Solution:
    def arrangeCoins(self, n: int) -> int:
        r1 = int((-1+(1+4*2*n)**(1/2))//2)
        r2 = int((-1-(1+4*2*n)**(1/2))//2)
        return(max(r1,r2))