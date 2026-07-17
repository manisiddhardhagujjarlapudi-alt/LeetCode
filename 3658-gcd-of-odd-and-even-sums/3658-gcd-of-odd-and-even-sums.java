class Solution {
    public int gcd(int a,int b){
        int m = 0;
       for(int i = Math.min(a,b); i>= 0; i--){
        if(a % i == 0 && b % i == 0){
            m = i;
            break;
        }
       }
       return m;
    }
    // public int gcd(int a,int b){
    //     if(a == 0) return b;
    //     return gcd(b%a,a);
    // }
    public int gcdOfOddEvenSums(int n) {
        if (n == 0) return 0;
        return gcd(n*n,n*(n+1));
    }
}