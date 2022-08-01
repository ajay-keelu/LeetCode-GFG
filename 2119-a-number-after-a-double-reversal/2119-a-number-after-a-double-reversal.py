class Solution:
    def isSameAfterReversals(self, num: int) -> bool:
        t=int(str(num)[::-1])
        t=int(str(t)[::-1])
        if num==t:
            return True
        return False