class Solution:
    def fib(self, n: int) -> int:
        
        if n==0:
            return 0
        elif n==1:
            return 1
        else:
            x=0
            y=1
            sm=0
            for _ in range(2,n+1):
                sm=x+y
                x=y
                y=sm
            return sm
                