class Solution {
    Integer[][] dp;
    public int mChart(int[] prices , int day, boolean canBuy){
        //Base condition 
        if (day >= prices.length) return 0;

        if (dp[day][canBuy ? 1 : 0] != null)
        return dp[day][canBuy ? 1 : 0];
        if (canBuy){
            //either buy today or skip today
            return dp[day][canBuy ? 1 : 0] = Math.max(
                mChart(prices, day+1 ,false) - prices[day],
                mChart(prices, day+1 ,true) 
            );
        }

        // either sell today or skip today
        return dp[day][canBuy ? 1 : 0] = Math.max(
            mChart(prices,day+1,canBuy) ,
            mChart(prices,day+2,!canBuy) + prices[day]
        );
        
    }
    public int maxProfit(int[] prices) {
        dp = new Integer[prices.length+1][prices.length+1]; 
        return mChart(prices, 0 , true);
    }
}
