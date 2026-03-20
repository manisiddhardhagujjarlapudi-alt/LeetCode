class Solution(object):
    def defangIPaddr(self, address):
        ip = ""
        for i in address:
            if i == ".":
                ip += "[.]"
            else:
                ip += i    
        return ip