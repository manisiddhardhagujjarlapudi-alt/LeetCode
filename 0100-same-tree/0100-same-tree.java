
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return Traversal(p,q);
    }
    public boolean Traversal(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false; 
        return Traversal(p.left,q.left) && Traversal(p.right,q.right);

    }
}