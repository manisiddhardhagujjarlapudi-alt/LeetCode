class Solution {
    static int[] dp;
    public int climbStairs(int n) {
        dp = new int[n+2];
        Arrays.fill(dp,-1);
        return stairs(n+1);

    }
    public int stairs(int n) {
        if(n == 0 || n== 1) return n;
        if(dp[n] != -1) return dp[n];
        int ans = stairs(n-1)+stairs(n-2); 
        return dp[n] = ans;
    }
}