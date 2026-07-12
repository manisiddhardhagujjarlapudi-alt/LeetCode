class Solution {
    public int[] arrayRankTransform(int[] a) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = a.length;
        int[] c = new int[n];
        for(int i = 0 ; i < a.length; i++){
            c[i] = a[i];
        }
        int [] b = new int[n];
        Arrays.sort(a);
        int k = 1;
        for(int i = 0 ; i < a.length; i++){
            if(!map.containsKey(a[i])){
                map.put(a[i],k);
                k++;
            }
        }
        for(int i = 0 ; i < b.length; i++){
            if(map.containsKey(c[i])){
                b[i] = map.get(c[i]);
            }
        }
        return b;
    }
}