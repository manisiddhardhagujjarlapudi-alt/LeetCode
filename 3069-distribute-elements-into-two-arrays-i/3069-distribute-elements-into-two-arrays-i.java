class Solution {
    public int[] resultArray(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(arr[0]);
        b.add(arr[1]);
        for(int i = 2; i < n;i++){
            if(a.get(a.size()-1) > b.get(b.size()-1)){
                a.add(arr[i]);
            }else{
                b.add(arr[i]);
            }
        }
        int k = 0;
        for(int i= 0; i < a.size();i++){
            arr[k] = a.get(i);
            k++;
        }
        for(int i = 0; i < b.size();i++){
            arr[k] = b.get(i);
            k++;
        }
        return arr;
    }
}