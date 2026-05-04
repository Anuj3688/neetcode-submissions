class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0;
        int totalcost = 0;
        for (int i=0 ;i<gas.length ; i++){
            totalgas += gas[i];
            totalcost += cost[i];
        };
        if (totalgas<totalcost){
            return -1;
        }

        totalgas = 0;
        int res = 0;
        for (int i=0 ; i<gas.length ; i++){
            totalgas  = totalgas + gas[i] - cost[i];
            if (totalgas < 0 ){
                totalgas = 0;
                res = i+1;
            }
        }

        return res;
    }
}
