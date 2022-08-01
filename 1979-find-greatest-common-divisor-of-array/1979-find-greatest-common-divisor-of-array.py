class Solution:
    def findGCD(self, nums: List[int]) -> int:
        mx=0
        a=min(nums)
        b=max(nums)
        for i in range(1,a+1):
            if a%i==0 and b%i==0 :
                mx=max(mx,i)
        return mx