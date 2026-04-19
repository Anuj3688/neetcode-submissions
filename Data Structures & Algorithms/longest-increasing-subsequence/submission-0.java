class Solution {
    int[][] array;
    public int longest(int[] nums, int i, int last){
        if (i == nums.length){
            return 0;
        }
        if (array[i][last + 1] != -1){
            return array[i][last + 1];
        }
        int not = longest(nums , i+1 , last);
        int take = 0;
        if (last== -1 || nums[i] > nums[last] )
            take  = 1 + longest(nums , i+1 , i);

        return array[i][last+1] = Math.max(not,take);
    }
    public int lengthOfLIS(int[] nums) {
        array = new int[nums.length+2][nums.length+2];
        for (int i = 0; i < array.length; i++) {
        Arrays.fill(array[i], -1);
        }
        return longest(nums , 0 , -1);
    }
}
