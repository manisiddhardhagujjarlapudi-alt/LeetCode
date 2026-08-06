class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int p = product(n);
            if(p % t == 0){
                return n;
            }
            n++;
        }
    }
    public int product(int n) {
        int pro = 1;
        while(n > 0){
            pro *= n % 10;
            n /= 10;
        }
        return pro;
    }
}