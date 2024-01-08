class Solution:
    def defangIPaddr(self, address: str) -> str:
        value1 = ""
        for i in address:
            if i == ".": value1 += "[.]"
            else: value1 += i
        return value1
        