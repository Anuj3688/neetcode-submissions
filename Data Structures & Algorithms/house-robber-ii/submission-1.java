class Solution {
    int[] record;
    public int steal(int n , int[] nums, int end){
        if (n>end){
            return 0;
        }

        if (n == end){
            return nums[end];
        }
        if (record[n] != -1)
            return record[n];

        return record[n] = Math.max(
            nums[n] + steal(n+2 , nums , end),
            steal(n+1 , nums, end)
        );
    }
    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        record = new int[nums.length+1];

        Arrays.fill(record, -1);
        int case1 = steal(0,nums,nums.length-2);

        Arrays.fill(record, -1);
        int case2 = steal(1, nums ,nums.length-1);

        return Math.max(case1,case2);

    }
}
