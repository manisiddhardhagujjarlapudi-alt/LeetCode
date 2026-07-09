class Solution {
    public int value(char ch){
        if(ch == 'I') return 1;
        if(ch == 'V') return 5;
        if(ch == 'X') return 10;
        if(ch == 'L') return 50;
        if(ch == 'C') return 100;
        if(ch == 'D') return 500;
        if(ch == 'M') return 1000;
        return 0;
    }
    public int romanToInt(String s) {
        int n = s.length();
        int count = 0;
        int i = 0;
        while(i < n){
            if(i < n - 1 && value(s.charAt(i+1)) > value(s.charAt(i))){
                count += value(s.charAt(i+1)) - value(s.charAt(i));
                i += 2;
            }else{
                count += value(s.charAt(i));
                i+=1;
            }
        }
        return count;
    }
}