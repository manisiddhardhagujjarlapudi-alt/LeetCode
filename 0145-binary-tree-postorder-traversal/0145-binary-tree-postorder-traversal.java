
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        travel(root,ans);
        return ans;
    }
    public void travel(TreeNode root, List<Integer> ans ){
        if(root == null) return;
        travel(root.left,ans);
        travel(root.right,ans);
        ans.add(root.val);
    }
}