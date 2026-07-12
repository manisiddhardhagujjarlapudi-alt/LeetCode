class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        s = ""
        if len(strs)== 0: return s
        strs.sort()
        f = strs[0]
        l = strs[-1]
        for i in range(len(f)):
            if f[i] == l[i]:
                s +=f[i]
            else :
                break    
        return s        

        