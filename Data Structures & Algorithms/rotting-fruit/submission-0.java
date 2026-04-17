class Solution {
    int M;
    int N;
    public int orangesRotting(int[][] grid) {
        M = grid.length;
        N = grid[0].length;
        int count = 0;

        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;

        for (int i=0 ; i<M ; i++){
            for( int j=0 ; j<N ; j++){
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }
                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0) return 0;
        int minutes = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rotted = false;
            int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();

                for (int[] d : dirs) {
                    int ni = curr[0] + d[0];
                    int nj = curr[1] + d[1];

                    if (ni >= 0 && ni < M && nj >= 0 && nj < N && grid[ni][nj] == 1) {
                        grid[ni][nj] = 2;
                        queue.offer(new int[]{ni, nj});
                        fresh--;
                        rotted = true;
                    }
                }
            }

            if (rotted) minutes++;
        }
        return fresh == 0 ? minutes : -1;
    }
}
