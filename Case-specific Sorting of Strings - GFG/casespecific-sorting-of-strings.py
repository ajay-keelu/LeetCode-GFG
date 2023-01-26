#User function Template for python3

class Solution:

    #Function to perform case-specific sorting of strings.
    def caseSort(self,s,n):
        #code here
        sm = []
        cp = []
        for i in s:
            if 'a' <= i and i <= 'z' :
                sm.append(i)
            else:
                cp.append(i)
        sm = sorted(sm)
        cp = sorted(cp)
        k = 0
        j = 0
        res = ""
        for i in s :
            if 'a' <= i and i <= 'z' :
                res += sm[k]
                k +=1
            else:
                res += cp[j]
                j += 1
        return res


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for tt in range(t):
        n=int(input())
        s=str(input())
        print(Solution().caseSort(s,n))
# } Driver Code Ends