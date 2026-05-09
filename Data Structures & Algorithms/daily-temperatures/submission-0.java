class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arr  = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = temperatures.length-1;  i >= 0 ; i--){
           while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]){
            stack.pop();
           }

           if (stack.isEmpty()){
            arr[i]=0;
           }else{
            arr[i] = stack.peek()-i;
           }
           stack.push(i);
        }
        return arr;
    }
}
