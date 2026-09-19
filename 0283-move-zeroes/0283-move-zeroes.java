class Solution {
    public void moveZeroes(int[] arr) {
       int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0)count += 1;
        }
        int idx = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0) arr[idx++] = arr[i];
        }
        for(int i = 0; i < count; i++){
            arr[idx++] = 0;
        }
    }
}