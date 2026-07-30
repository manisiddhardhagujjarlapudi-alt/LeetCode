class Solution {
    public int minimumPushes(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++ ){
            count += (i/8)+1;

        }
        return count;
    }
}