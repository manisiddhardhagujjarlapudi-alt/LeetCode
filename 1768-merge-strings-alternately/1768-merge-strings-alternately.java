class Solution {
    public String mergeAlternately(String m, String n) {
        String s ="";
        int i = 0, j = 0;
        int k = 0;
        while(i < m.length() && j < n.length() ){
            if(k == 0){
                s+= m.charAt(i);
                k = 1;
                i++;
            }else{
                s+= n.charAt(j);
                k = 0;
                j++;
            }
        }
        while(i < m.length()){
            s+= m.charAt(i);
            i++;
        }
        while(j < n.length()){
            s+= n.charAt(j);
            j++;
        }
        return s;
    }
}