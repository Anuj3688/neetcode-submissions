class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // now if only 1 element then return that 
        //if 0 elemenet then return 0
        //run while loop to smash if atleast 2 elements found
        for (int stone : stones){
            maxHeap.offer(stone);
        }
        while (maxHeap.size()>=2){
            int ele1 = maxHeap.poll();
            int ele2 = maxHeap.poll();
            if (ele1 != ele2) {

                maxHeap.offer(ele1 - ele2);

            }
        }

        if (maxHeap.size()==1) return maxHeap.poll();
        else return 0;
    }
}
