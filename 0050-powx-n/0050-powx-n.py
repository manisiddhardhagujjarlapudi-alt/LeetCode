class Solution(object):
    def pow(self,x,n):
        if n == 0:
            return 1
        a = self.pow(x,n//2)
        if n% 2 == 0:
            return a*a
        else:
            return a*a*x

    def myPow(self, x, n):
        if n>=0:
            return self.pow(x,n)
        else:
            return 1/self.pow(x,n*(-1))    
        