class Solution {
    public int reverseDegree(String s) {
        int count = 0;
        for(int i = 0; i < s.length() ; i++){
            char ch = s.charAt(i);
            count += (i+1)*(123-(int)(ch));
        }
        return count;
    }
}