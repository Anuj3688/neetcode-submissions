class Solution {
    int[] records;
    public int climb(int n, int[] cost){
        if (n==cost.length-1){
            return cost[n];
        }

        if (records[n] != -1){
            return records[n];
        }

        if (n > cost.length-1){
            return 0;
        }

        return records[n]= Math.min(
            cost[n] + climb(n+1,cost),
            cost[n] + climb(n+2,cost)
        );

    }
    
    public int minCostClimbingStairs(int[] cost) {
        records = new int[cost.length+1];
        for (int i=0 ; i<cost.length+1 ; i++){
            records[i] = -1;
        }
        return Math.min(
            climb(0, cost),
            climb(1, cost)
        );
    }
}
