class Solution {
    public int strStr(String s, String a) {
        for(int i = 0, j = a.length(); j<=s.length(); i++,j++){
            if(s.substring(i,j).equals(a)){
                return i;
            }
        }
        return -1;
    }
}