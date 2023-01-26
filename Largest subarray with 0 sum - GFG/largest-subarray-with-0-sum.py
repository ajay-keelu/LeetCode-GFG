#Your task is to complete this function
#Your should return the required output
class Solution:
    def maxLen(self, n, arr):
        #Code here
        dic = dict()
        sm = 0
        mx = 0
        dic[0] = -1
        for i,v in enumerate(arr):
            sm += v
            if sm not in dic:
                dic[sm] = i
            else:
                mx = max(i-dic[sm],mx)
        return mx;

#{ 
 # Driver Code Starts
if __name__=='__main__':
    t= int(input())
    for i in range(t):
        n = int(input())
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        print(ob.maxLen(n ,arr))
# Contributed by: Harshit Sidhwa
# } Driver Code Ends