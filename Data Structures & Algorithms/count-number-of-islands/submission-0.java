class Solution {
    class Pair{
        int x;
        int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public boolean isValid(char[][] grid, int x, int y){
        return (x>=0 && y>=0 && x<grid.length && y<grid[0].length && grid[x][y]=='1');
    }
    public  int[][] nei = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    public  void dfs( char[][] grid, int i , int j){
        grid[i][j] = 'A';
        for (int[] ele:nei){
            int x = i+ ele[0];
            int y = j+ ele[1];
            if (isValid(grid, x,y)){
                    dfs(grid,x,y);
                }
        }
    }
    public int numIslands(char[][] grid) {
        if (grid.length ==0 || grid[0].length ==0){
            return 0;
        }

        int answer = 0;
        for (int i=0 ;i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){
                if (grid[i][j] == '1'){
                    dfs(grid,i,j);
                    answer++;
                }
            }
        }

        return answer;
    }
}
