class Solution {
    public int mySqrt(int x) {
    // long root = 0;
    //     for(long i = 1; i <= x ; i++){
    //         if(i*i > x) break;
    //         root = i;  
    //     }
    //     return (int)root;
    // }
    long l = 0,h=x;
    while(l<=h){
        long mid = (l+h)/2;
        if(mid*mid == x ) return (int)mid;
        else if(mid*mid > x) h = mid - 1;
        else l = mid + 1;
    } return (int)h;
}
}