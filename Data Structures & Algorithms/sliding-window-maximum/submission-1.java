class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
  
        int[] ans = new int[nums.length - k +1];

        Deque<Integer> max = new ArrayDeque<>(); //inserted the first element
        for (int i = 0 ; i<nums.length ; i++){
            while (!max.isEmpty() && nums[max.peekLast()] < nums[i]){
                max.removeLast();
            }
            max.add(i);
            if (max.peekFirst() <= i-k){
                max.removeFirst();
            }
            // Window formed
            if (i >= k - 1) {
                ans[i - k + 1] =
                        nums[max.peekFirst()];
            }
        } 

        return ans;
    }
}
