
class Solution {
    int[] money;
    public int steal(int n , int[] nums){
        if (n >= nums.length)
            return 0;
        if (money[n] != -1){
            return money[n];
        }

        return money[n] = Math.max (nums[n]+steal(n+2,nums), steal(n+1,nums));
    }
    public int rob(int[] nums) {
        money = new int[nums.length+1];
        Arrays.fill(money, -1);
        return Math.max(
        steal(0,nums),
        steal(1,nums)
        );
    }
}
