class Solution {
    public boolean containsDuplicate(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        // if(arr.length == 2 && arr[0] == arr[1]) return true;
        boolean flag = false;
        for(int i = 0; i < n-1; i++){
            if(arr[i]== arr[i+1]){
                flag = true;
                break;
            }
        }
        return flag;
    }
}