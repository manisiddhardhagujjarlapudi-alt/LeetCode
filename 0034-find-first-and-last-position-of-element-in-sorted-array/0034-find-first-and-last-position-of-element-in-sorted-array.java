class Solution {
    public int[] searchRange(int[] arr, int tar) {
        int[] a = {-1,-1};
        int lo = 0, hi = arr.length-1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] == tar){
                a[0] = mid;
                hi = mid - 1; 
            }else if(arr[mid] > tar) hi = mid - 1;
            else lo = mid + 1;
        }
        lo = 0; 
        hi = arr.length-1;
        while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            if(arr[mid] == tar){
                a[1] = mid;
                lo = mid + 1; 
            }else if(arr[mid] > tar) hi = mid - 1;
            else lo = mid + 1;
        }
        return a;
    }
}