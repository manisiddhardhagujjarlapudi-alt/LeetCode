class Solution {
    public int firstMissingPositive(int[] arr) {
       int n = arr.length;
       int i = 0;
       while(i < n ){
        if (arr[i] <= 0) i++;
        else if(arr[i] > n) i++;
        else if(arr[i] == i + 1) i++;
        else if(arr[i] == arr[arr[i]-1]) i++;
        else{
            int idx = arr[i]-1;
            swap(arr,i,idx);

        }
       } 
       for(i = 0 ; i < n ; i ++){
        if(arr[i]!= i+1){
            return i+1;
        }
       }
       return n+1;
    }
    public void swap(int[] arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}