class Solution {
    public int majorityElement(int[] arr) {
        Arrays.sort(arr);
        int i = 0, j = 0;
        int ele = 0;
        int max = Integer.MIN_VALUE;
        while(j < arr.length){
            if(arr[i] == arr[j]) j++;
            else{
                int len = j-i;
                if(len > max){
                    max = Math.max(len,max);
                    ele = arr[i];
                }
                i = j;
            }
        }
        int len = j-i;
        if(len > max){
            max = Math.max(len,max);
            ele = arr[i];
        }
        return ele;
    }
}