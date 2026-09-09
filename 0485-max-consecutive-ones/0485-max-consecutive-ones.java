class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == 1){
                count += 1;
                max = Math.max(count,max);
            }else{
                count = 0;
            }
        }
        if(max == Integer.MIN_VALUE) return 0;
        return max;
    }
}