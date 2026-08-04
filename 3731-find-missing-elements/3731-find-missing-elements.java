class Solution {
    public List<Integer> findMissingElements(int[] arr) {
       int k = 101;
       int j = 0;
       for(int i = 0; i < arr.length; i++){
        if(arr[i] > j) j = arr[i];
        if(arr[i] < k) k = arr[i];
       }
       Set<Integer> set = new HashSet<>();
       ArrayList<Integer> ans = new ArrayList<>();
       for(int i = 0; i < arr.length; i++){
        if(!set.contains(arr[i])){
            set.add(arr[i]);
        }
       }
       for(int i = k ; i <= j; i++){
        if(!set.contains(i)){
            ans.add(i);
        }
       }
       return ans;
    }
}