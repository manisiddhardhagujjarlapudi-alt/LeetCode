class Solution {
    public int smallestIndex(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int t = arr[i];
            int res = 0;
            while(t > 0){
                res += (t % 10);
                t = t / 10;
            }
            if(res == i) return i;
        }
        return -1;
    }
}