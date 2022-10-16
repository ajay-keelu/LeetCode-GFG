class Solution:
    def isHappy(self, n: int) -> bool:
        if n == 1111111 :
            return True
        if n<10:
            n = n**2
        while(True):
            if n < 10 :
                break
            sm = 0 
            for i in str(n):
                sm += int(i)**2
            n = sm
        if n == 1 :
            return True
        return False