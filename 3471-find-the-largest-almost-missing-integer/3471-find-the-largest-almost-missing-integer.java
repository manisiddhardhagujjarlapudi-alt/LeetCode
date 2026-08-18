class Solution {
    public int largestInteger(int[] arr, int k) {
        int n = arr.length;
        int[] count = new int[51];
        for(int i = 0; i <= n - k; i++){
            boolean[] a = new boolean[51];
            for(int j = i;j < i+k; j++){
                if(!a[arr[j]]){
                    count[arr[j]] += 1;
                    a[arr[j]] = true;
                }
            }
        }
        for(int i = 50; i >= 0; i--){
            if(count[i] == 1){
                return i;
            }
        }
        return -1; 
    }
}