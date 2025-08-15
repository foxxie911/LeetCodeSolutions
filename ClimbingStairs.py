class Solution:
    def climbStairs(self, n: int) -> int:
        if n == 0 or n == 1 or n == 2 : 
            return n;

        preOne = 2
        preTwo = 1
        for i in range(3, n+1):
            temp = preOne + preTwo
            preTwo = preOne
            preOne = temp
        return preOne
