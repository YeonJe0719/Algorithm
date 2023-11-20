class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = cost[i] + Math.min(dp[i + 1], (i + 2 <= n) ? dp[i + 2] : 0);
        }

        return Math.min(dp[0], dp[1]);
    }
}