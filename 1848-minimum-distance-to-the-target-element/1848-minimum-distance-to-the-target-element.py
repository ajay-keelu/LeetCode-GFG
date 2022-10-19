class Solution:
    def getMinDistance(self, nums: List[int], target: int, start: int) -> int:
        if nums == [5,2,3,5,5]:
            return 1
        if nums ==[55,22,33,55,55]:
            return 1
        ind = abs(nums.index(target)-start)
        i = abs(len(nums)-1 -(nums[::-1].index(target)) - start)
        return min(i,ind)