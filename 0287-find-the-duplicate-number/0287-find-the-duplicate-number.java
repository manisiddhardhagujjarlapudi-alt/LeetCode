class Solution {
    public int findDuplicate(int[] arr) {
        int n = arr.length;
        int i = 0;
        while(i <= n-1){
            if(arr[i]==i+1 || arr[i]==arr[arr[i]-1] ) i++;
            else{
                int idx = arr[i] - 1;
                swap(arr,i,idx);
            }
        }
        for(i = 0; i < n-1; i++){
            if(arr[i] != i+1) return arr[i];
        }
        return arr[n-1];
    }
    public void swap(int[] arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}