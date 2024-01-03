class Solution:
    def romanToInt(self, s: str) -> int:
        c,p = 0,""
        for l in s:
            if l == "M":
                if p =="C":
                    c += 800
                else:
                    c += 1000
                p = "M"
            elif l == "D":
                if p =="C":
                    c += 300
                else:
                    c += 500
                p = "D"
            elif l == "C":
                if p == "X":
                    c+= 80
                else:
                    c += 100
                p = "C"
            elif l == "L":
                if p =="X":
                    c += 30
                else:
                    c += 50
                p ="L"
            elif l == "X":
                if p == "I":
                    c += 8
                else:
                    c += 10
                p = "X"
            elif l == "V":
                if p == "I":
                    c += 3
                else:
                    c+= 5
                p= "I"
            elif l == "I":
                c += 1
                p= "I"
        return c