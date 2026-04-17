class Solution {
    private int[] possible;
    public int climbStairs(int n) {
        possible = new int[n+1];
        for (int i=0; i<=n ; i++){
            possible[i] = -1;
        }
        return climb(n);
    }

    public int climb(int n) {
        if (n < 0){
            return 0;
        }
        if (possible[n] != -1 ){
            return possible[n];
        }

        
        if (n == 0)
            return 1;

        return possible[n]= climb(n-1)+climb(n-2); 
    }
}
