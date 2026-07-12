class Solution {
    public String longestCommonPrefix(String[] arr) {
        if (arr.length == 0) return "";
        Arrays.sort(arr);
        String f = arr[0];
        String l = arr[arr.length-1];
        String s = "";
        for(int i = 0; i < f.length(); i++){
            if(f.charAt(i)== l.charAt(i)){
                s+= f.charAt(i);
            }else{
                break;
            }
        }
        return s;
    }
}