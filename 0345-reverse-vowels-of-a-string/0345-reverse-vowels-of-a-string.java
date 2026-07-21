class Solution {
    public boolean vowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'o' || ch== 'i'|| ch=='u' || ch == 'A' || ch == 'E' || ch == 'I'||ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int i = 0; int j = a.length-1;
        while(j > i){
            while(i < j && !vowel(a[i])) i++;
            while(i < j && !vowel(a[j])) j--;
            if(j > i){
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        return new String(a);
    }
}