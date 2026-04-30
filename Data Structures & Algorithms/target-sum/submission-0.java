class Solution {
    public int ways(int[] nums, int target, int index, int[][] dp, int offset) {
        if (index == nums.length) {
            return target == 0 ? 1 : 0;
        }
        if (target > offset || target < -offset) {
            return 0;
    }
        if (dp[index][target + offset] != -1) {
            return dp[index][target + offset];
        }

        int add = ways(nums, target - nums[index], index + 1, dp, offset);
        int subtract = ways(nums, target + nums[index], index + 1, dp, offset);

        return dp[index][target + offset] = add + subtract;
    }

    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for (int num : nums) totalSum += num;

        if (Math.abs(target) > totalSum) return 0;

        int[][] dp = new int[nums.length][2 * totalSum + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        return ways(nums, target, 0, dp, totalSum);
    }
}