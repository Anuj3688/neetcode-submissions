class Solution {
    public int ways(int[] coins , int amm, int index, int[][] dp){
        // cond1 reached 0 possible way
        if (amm == 0){
            return 1;
        }
        //reached 
        if (amm<0 || index ==coins.length) {
            return 0;
        }

        if (dp[index][amm] !=  -1){
            return dp[index][amm];
        }
        return  dp[index][amm] = ways(coins, amm-coins[index] , index , dp) + ways(coins ,amm , index+1 , dp) ;
    }
    public int change(int amount, int[] coins) {    
        int[][] dp = new int[coins.length+1][amount+1];
        for (int i=0 ; i<= coins.length ; i++){
            Arrays.fill(dp[i],-1);
        }
        return ways(coins,amount,0 ,dp);
    }
}
