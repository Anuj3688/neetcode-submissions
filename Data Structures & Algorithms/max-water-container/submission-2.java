class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int val = 0;
        while (left < right){
            int curr = Math.min(heights[left] ,heights[right] );
            val = Math.max(val,curr*(right-left));
            if (heights[left]<heights[right] ){
                left++;
            }
            else{
                right --;
            }
        }

        return val;

    }
}
