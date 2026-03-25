class Solution(object):
    def climbStairs(self, n):
        if n == 2 or n ==1:
            return n
        a = 1
        b = 2
        for i in range(3,n+1):
            c = a+b
            a = b
            b = c
        return b        
