class Solution {
    int[] dp; 
    public int minCount(int[] coins,int amount){
        if (amount==0){
            return 0;
        }
        if (amount < 0){
            return Integer.MAX_VALUE;
        }
        if (dp[amount] != -1) return dp[amount];
        int min = Integer.MAX_VALUE;
        for (int coin: coins){
            int res = minCount(coins,amount-coin);
            if (res != Integer.MAX_VALUE) {
                min = Math.min(min, 1 + res);
             }
        }
        dp[amount] = min;
        return min;
    }
    public int coinChange(int[] coins, int amount) {
        dp = new int[amount+1];
        Arrays.fill(dp,-1);
        int res = minCount(coins,amount);
        return res==Integer.MAX_VALUE ? -1 : res;
    }
}
