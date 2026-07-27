class Solution {
    public int maxProduct(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int k = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>= max1){
                max1 = arr[i];
                k = i;
            }
        }
        int j = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= max2 && i != k ){
                max2 = arr[i];
            }
        }
        return (max1-1)*(max2-1);
    }
}