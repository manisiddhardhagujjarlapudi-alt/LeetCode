class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;
        char[] c = s.toCharArray();
        char[] d = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        int i = 0; int j = 0;
        while(i < c.length && j < d.length){
            if(c[i]!=d[i]){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}