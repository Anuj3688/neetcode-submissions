class Solution:
    def maxProfit(self, p: List[int]) -> int:
        profit = 0
        for i in range(len(p)):
            for j in range(i+1,len(p)):
                curr = p[j] - p[i]
                if profit<curr:
                    profit  = curr
        return profit

        