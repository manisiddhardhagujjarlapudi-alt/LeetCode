class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n = arr.length;
        int sum = 0;
        int l = 0;
        int maxlen = Integer.MAX_VALUE;
        for(int r = 0; r < n; r++){
            sum += arr[r];
            while(sum >= target){
                maxlen = Math.min(maxlen,r-l+1);
                sum -= arr[l];
                l++;
            }
        }
        return maxlen==Integer.MAX_VALUE ? 0 : maxlen;
    }
}