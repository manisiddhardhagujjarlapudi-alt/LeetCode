class Solution(object):
    def tribonacci(self, n):
        if n==0:
            return 0
        if n == 1 or n == 2:
            return 1
        j = 0
        k = 1
        l = 1
        next1 = 0
        for i in range(3,n+1):
            next1 = j+k+l
            j = k
            k = l
            l = next1
        return l            