class Solution:
    def isUgly(self, n: int) -> bool:
        if n <= 0:
            return False
        
        for val in [2, 3, 5]:
            while n % val == 0:
                n //= val
        return n == 1 #bijoysaga