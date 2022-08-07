class Solution:
    def minimumSum(self, num: int) -> int:
        nums=list(str(num))
        nums=sorted(nums)
        t=int(nums[0]+nums[2])+int(nums[1]+nums[3])
        return t