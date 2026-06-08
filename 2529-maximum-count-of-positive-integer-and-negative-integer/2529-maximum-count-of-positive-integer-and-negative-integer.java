class Solution {
    public int maximumCount(int[] arr) {
        int t = countNegNum(arr);
        int lo = 0 ; int hi = arr.length-1;
        int posCount = 0;

        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(arr[mid]>0) hi = mid -1 ;
            else {
                lo = mid + 1 ;
                posCount = lo;
            }
        }

        return Math.max(arr.length-posCount , t ) ;
    }
    private static int countNegNum(int[] arr) {
        int lo = 0 ; int hi = arr.length-1;
        int negCount = 0;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr[mid] >= 0) {
                hi = mid - 1;
                negCount = hi;
            }
            else{
                lo = mid + 1;
            }
        }
        return hi + 1;
    }
}