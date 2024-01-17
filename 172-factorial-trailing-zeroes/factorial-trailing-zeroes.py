class Solution:
    def trailingZeroes(self, n: int) -> int:
        if n == 0:
            return 0

        factorial_result = 1
        for multiplier in range(1, n + 1):
            factorial_result *= multiplier

        trailing_zero_count = 0
        while factorial_result > 0:
            if factorial_result % 10 == 0:
                trailing_zero_count += 1
            else:
                return trailing_zero_count
            factorial_result //= 10

        return trailing_zero_count
