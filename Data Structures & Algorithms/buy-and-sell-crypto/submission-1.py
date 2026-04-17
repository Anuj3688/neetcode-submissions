class Solution:
    def maxProfit(self, p: List[int]) -> int:
        min_price = p[0]
        max_profit = 0

        for i in range(1, len(p)):
            if p[i] < min_price:
                min_price = p[i]
            else:
                max_profit = max(max_profit, p[i] - min_price)

        return max_profit
        