class Solution {
    public int jump(int[] nums) {

        // now. this is basic solution
        //what about the count;
        int res = 0;
        int left = 0;
        int right   = 0;
        while (right < nums.length-1){
            int large = 0;
            for (int i = left ; i<=right ; i++){
                large = Math.max(large , i+nums[i]);
            }
            left = right+1;
            right = large;
            res +=1;
        }

        return res;
    }
}
