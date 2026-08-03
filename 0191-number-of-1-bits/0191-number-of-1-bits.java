class Solution {
    public int hammingWeight(int n) {
        if(n == 0) return 0;
        StringBuilder st = new StringBuilder();
        while(n > 0){
            st.append(n%2);
            n = n / 2;
        }
        int count = 0;
        for(int i = 0; i < st.length();i++){
            if(st.charAt(i)=='1'){
                count ++;
            }
        }
        return count;
    }
}