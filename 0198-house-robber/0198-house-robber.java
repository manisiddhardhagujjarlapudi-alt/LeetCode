class Solution {
    static int[] dp;
    public int maxrob(int i , int[] arr){
        if(i >= arr.length) return 0;
        if(dp[i] != -1) return dp[i];
        int pick = arr[i] + maxrob(i+2,arr);
        int skip = maxrob(i+1,arr);
        return dp[i] = Math.max(pick,skip);
    }
    public int rob(int[] arr) {
        int i = 0;
        dp = new int[arr.length];
        for(int j = 0; j < dp.length; j++){
            dp[j] = -1;
        }
        return maxrob(i,arr);
    }
}