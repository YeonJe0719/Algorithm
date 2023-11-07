class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        Queue<int[]> queue = new LinkedList<>();

        int freshOranges = 0;
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 2){
                    queue.offer(new int[]{i,j});
                }else if(grid[i][j] == 1){
                    freshOranges++;
                }
            }
        }

        int minutes = 0;
        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i = 0; i < size; i++){
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];

                for(int d = 0; d < 4; d++){
                    int newX = x + dx[d];
                    int newY = y + dy[d];

                    if(newX >=0 && newX < m && newY >= 0 && newY < n && grid[newX][newY] == 1){
                        grid[newX][newY] = 2;
                        freshOranges--;
                        queue.offer(new int[]{newX, newY});
                    }
                }
            }

            if(!queue.isEmpty()){
                minutes++;
            }
        }

        return freshOranges == 0 ? minutes : -1;
    }
}