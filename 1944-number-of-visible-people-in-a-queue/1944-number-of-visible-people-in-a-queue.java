class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] a = new int[n];
        a[n-1] = 0;
        st.push(arr[n-1]);
        for(int i = n-2 ; i >= 0 ; i--){
            int count = 0;
            while(st.size() > 0 && arr[i]>= st.peek()){
                count++;
                st.pop();
            } 
            if(st.size() > 0 ) count ++;
            a[i] = count;
            st.push(arr[i]);
        }
        return a;
    }
}