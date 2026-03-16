class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        num = x
        res = 0
        while x > 0 :
            rem = x % 10
            res = (res * 10) + rem
            x = x // 10
        if num == res:
            return True
        else:
            return False        
        