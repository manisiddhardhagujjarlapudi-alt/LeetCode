class Solution {
    public int missingMultiple(int[] arr, int k) {
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        for(int a : arr){
            set.add(a);
        }
        int m = k;
        while(set.contains(m)){
            m += k;
        }
        return m;
    }
}