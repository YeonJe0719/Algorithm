import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length;
        int n = maze[0].length;
        
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        boolean[][] visited = new boolean[m][n];
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{entrance[0], entrance[1], 0});
        visited[entrance[0]][entrance[1]] = true;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];
            
            if ((x != entrance[0] || y != entrance[1]) && (x == 0 || x == m - 1 || y == 0 || y == n - 1)) {
                return distance;
            }
            
            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];
                
                if (newX >= 0 && newX < m && newY >= 0 && newY < n && !visited[newX][newY] && maze[newX][newY] == '.') {
                    queue.offer(new int[]{newX, newY, distance + 1});
                    visited[newX][newY] = true;
                }
            }
        }
        
        return -1;
    }
}
