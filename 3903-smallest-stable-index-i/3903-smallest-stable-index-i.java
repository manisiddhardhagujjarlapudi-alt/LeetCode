class Solution {
    public int firstStableIndex(int[] arr, int k) {
        int n = arr.length;
        int h=Integer.MAX_VALUE;
        for(int i = 0; i < n;i++){
            int maxele = Integer.MIN_VALUE;
            int minele = Integer.MAX_VALUE;
            for(int j = 0;j <= i; j++){
                if(arr[j] > maxele){
                    maxele = arr[j];
                }
            }
            for(int j = i;j <= n-1; j++){
                if(arr[j] < minele){
                    minele = arr[j];
                }
            }
            int m = maxele - minele;
            if(m <= k ){
                return i;
            }
        }
        return -1;
    }
}