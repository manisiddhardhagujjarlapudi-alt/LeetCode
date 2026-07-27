
class Solution {
    public int reverse(int x) {
        long res = 0;
        long t = x;
        if(t < 0 ) t = -t;
        while(t > 0){
            res = res * 10 + t % 10;
            t /= 10;
        }
        if(x < 0) res= -res;
        if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        return (int)res;
    }
}