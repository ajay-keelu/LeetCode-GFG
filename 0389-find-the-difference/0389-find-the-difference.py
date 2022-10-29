class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        s=list(s)
        for i in t:
            if i not in s:
                return i
            s.remove(i)