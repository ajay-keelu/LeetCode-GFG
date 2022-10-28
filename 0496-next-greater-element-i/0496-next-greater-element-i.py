class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        li = []
        for i in nums1:
            ind = nums2.index(i)
            for j in nums2[ind:]:
                if j>i :
                    li.append(j)
                    break
            else:
                li.append(-1)
        return li