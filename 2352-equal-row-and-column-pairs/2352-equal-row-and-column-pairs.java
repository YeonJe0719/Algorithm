class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isEqualRowColumnPair(grid, i, j)) {
                    count++;
                }
            }
        }

        return count;
    }
    private boolean isEqualRowColumnPair(int[][] grid, int row, int col) {
        int n = grid.length;

        for (int k = 0; k < n; k++) {
            if (grid[row][k] != grid[k][col]) {
                return false;
            }
        }

        return true;
    }
}