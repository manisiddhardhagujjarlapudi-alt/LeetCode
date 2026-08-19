class Solution {
    public int findCircleNum(int[][] adj) {
        int n = adj.length;
        boolean[] vis = new boolean[n];
        int count = 0;
        for(int i = 0; i < n ; i++){
            if(!vis[i]){
                bfs(i,adj,vis);
                count++;
            }
        }
        return count;
    }
    public void bfs(int i, int[][] adj, boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        vis[i] = true;
        while(q.size() > 0){
            int front = q.remove();
            for(int j = 0; j < adj[front].length; j++ ){
                if(adj[front][j] == 1 && vis[j]== false){
                    q.add(j);
                    vis[j] = true;
                }
            }
        }
    }
}