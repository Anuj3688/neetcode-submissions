class Solution {
    int M,N;
    public int moving(int m , int n , int[][] grid){
        //Base Case
        if (m==M-1 && n==N-1)
            return 1; 
        //considerging out breach;
        if (m > M-1 || n > N-1 ){
            return 0;
        }
        if (grid[m][n] != -1){
            return grid[m][n];
        }
        // last two choice either go right or go down with current
        return  grid[m][n] = moving(m+1,n,grid) + moving(m,n+1,grid);
        
    }
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m+1][n+1];
        for (int[] arr: grid){
            Arrays.fill(arr,-1);
        }
        M = m;
        N = n;
        return moving(0, 0, grid);
    }
}
