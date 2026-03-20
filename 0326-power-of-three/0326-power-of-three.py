class Solution(object):
    def isPowerOfThree(self, n):
        if n == 0 or (n % 3 != 0 and not n == 1):
            return False
        if n==1:
            return True  
        while n % 3== 0:
            n = n//3
        return n == 1            
        