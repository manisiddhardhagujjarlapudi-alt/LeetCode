class Solution {
    public boolean isPerfectSquare(int num) {
        return bs(1,num,num);
    }
    public boolean bs(int lo,int hi,int n) {
        if(lo > hi) return false;
        int mid = lo+(hi-lo)/2;
        long s = (long)mid * mid;
        if(s == n) return true;
        else if(s < n) return bs(mid+1,hi,n);
        else return bs(lo,mid-1,n);
    }
}