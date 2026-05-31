class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> al = new ArrayList<>();
        int n = arr.length;
        int i = 0; 
        while(i < n){
            if(arr[i]==arr[arr[i]-1] || arr[i] == i+1) i++; 
            else {
                int idx = arr[i] - 1;
                swap(arr,i,idx);
            }
        }
        for (i = 0 ; i < n; i++){
            if (arr[i] != i+1) al.add(arr[i]);
        }
        return al;
    }
    public void swap(int[] arr ,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}