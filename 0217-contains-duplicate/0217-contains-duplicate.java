class Solution {
    public boolean containsDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();
        boolean flag = false;
        for(int i = 0; i < arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }else{
                flag = true;
                break;
            }
        }
        return flag;
        // Arrays.sort(arr);
        // // if(arr.length == 2 && arr[0] == arr[1]) return true;
        // boolean flag = false;
        // for(int i = 0; i < n-1; i++){
        //     if(arr[i]== arr[i+1]){
        //         flag = true;
        //         break;
        //     }
        // }
        // return flag;
    }
}