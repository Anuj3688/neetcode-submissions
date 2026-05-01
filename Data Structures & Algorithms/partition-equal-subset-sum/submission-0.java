class Solution {
    public boolean choice(int[] num, int sum , int i , Boolean[][] dp){
        if (sum == 0) return true;
        if (i == num.length || sum < 0) return false;

        if (dp[sum][i] != null) return dp[sum][i];
        return dp[sum][i] = choice(num , sum-num[i] , i+1, dp) || choice(num , sum , i+1 ,dp);

    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i:nums) sum += i;
        
        Boolean[][] dp = new Boolean[(sum/2)+1][nums.length+1];


        if (sum%2 == 0)
            return choice(nums , sum/2 , 0 ,dp);
        return false;
    }
}
