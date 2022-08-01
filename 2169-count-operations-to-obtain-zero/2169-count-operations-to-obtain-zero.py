class Solution:
    def countOperations(self, num1: int, num2: int) -> int:
        c=0
        while(True):
            if num1==0 or num2==0:
                break
            elif num1>=num2 :
                num1-=num2
                c+=1
            else:
                num2-=num1
                c+=1
        return c