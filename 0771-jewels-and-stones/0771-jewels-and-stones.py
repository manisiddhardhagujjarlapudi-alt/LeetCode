class Solution(object):
    def numJewelsInStones(self, jewels, stones):
        ans = 0
        for i in jewels:
            for j in stones:
                if i == j:
                    ans += 1
        return ans         