
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        // if(root == null) return 
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        return Traversal(root,ans);
               
    }
    public List<Integer> Traversal(TreeNode root,List<Integer> ans){
        if(root == null) return null;
        Traversal(root.left,ans);
        ans.add(root.val);
        Traversal(root.right,ans);
        return ans;
    }
}