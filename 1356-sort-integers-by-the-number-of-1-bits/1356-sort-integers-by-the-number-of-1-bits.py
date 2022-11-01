class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        count=[]
        arr = sorted(arr)
        for i in arr:
            count.append(bin(i)[2:].count('1'))
        n = len(count)
        for i in range(n):
            for j in range(n-i-1):
                 if count[j] > count[j + 1]:
                        arr[j],arr[j+1] = arr[j+1],arr[j]
                        count[j],count[j+1] = count[j+1],count[j]
        return arr