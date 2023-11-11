class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        // Initialize the top row and left column with 1, as there is only one way to reach any cell in the top row or left column.
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // Calculate the number of unique paths for each cell in the grid.
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        // The bottom-right cell contains the total number of unique paths.
        return dp[m - 1][n - 1];
    }
}
