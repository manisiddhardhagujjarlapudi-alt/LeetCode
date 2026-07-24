class Solution {
    public int countSegments(String s) {
        int count = 0;
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i)!=' ' && (i == 0 || s.charAt(i-1) == ' ')){
                count++;
            }
            i++;
        }
        return count;
    }
}